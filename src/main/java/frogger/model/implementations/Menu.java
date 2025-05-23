package frogger.model.implementations;

import java.awt.Graphics;
import java.util.List;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import frogger.common.Constants;
import frogger.common.GameState;
import frogger.model.interfaces.Button;

public class Menu{
    private final List<Button> buttons = new LinkedList<>();

    public Menu(GameState ... states) {
        loadButtons(states);
    }

    private void loadButtons(GameState ... states) {
        int xPos = (int)(Constants.FRAME_WIDTH/2);
        int yPos = (int)(Constants.FRAME_HEIGHT/2);
        for (int i = 0; i < states.length; i++) {
            int offset = (i - (int)(states.length / 2)) * (Constants.BUTTON_HEIGHT + Constants.BUTTONS_DISTANCE);
            buttons.add(new MenuButtons(xPos, yPos + offset, i, states[i]));
        }
    }

    public List<Button> getButtonList() {        
        return buttons;
    }

    public void update() {
        for(Button button : buttons){
            button.update();
        }
    }

    public void draw(Graphics g){
        for(Button button : buttons){
            button.draw(g);
        }
    }

    public void mousePressed(MouseEvent e){
       for(Button button : buttons){
            if(isIn(e, button)){
                button.setMousePressed(true);
                break;
            }
        } 
    }
    public void mouseReleased(MouseEvent e){
       for(Button button : buttons){
            if(isIn(e, button)){
                if(button.isMousePressed()){
                    button.applyGameState();
                    break;
                }
            }
        } 
        resetButtons();
    }

    public void mouseMoved(MouseEvent e){
        for(Button button : buttons){
            button.setMouseOver(false);
        }
        for(Button button : buttons){
            if(isIn(e, button)){
                button.setMouseOver(true);
                break;
            }
        }
    }

    private void resetButtons() {
       for(Button button : buttons){
            button.resetBools();      
        } 
    }

    public boolean isIn(MouseEvent e, Button button) {
        return button.getBounds().contains(e.getX(), e.getY());
    }

}