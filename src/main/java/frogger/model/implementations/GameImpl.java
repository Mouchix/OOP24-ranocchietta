package frogger.model.implementations;

import frogger.common.Position;
import frogger.model.interfaces.Game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameImpl implements Game, KeyListener{

    private PlayerObjectImpl player;

    public GameImpl(PlayerObjectImpl player){
        this.player = player;
    }

    @Override
    public boolean isGameOver() {
        return this.player.getLives()==0;
    }

    @Override
    public int getScore() {
        return this.player.getScore();
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 38){
            this.player.setLookingUp();
            this.player.setPos(new Position(this.player.getPos().x(), this.player.getPos().y() + 1));
        } else if (e.getKeyCode() == 40){
            this.player.setLookingDown();
            this.player.setPos(new Position(this.player.getPos().x(), this.player.getPos().y() - 1));
        } else if (e.getKeyCode() == 39){
            this.player.setLookingRight();
            this.player.setPos(new Position(this.player.getPos().x() + 1, this.player.getPos().y()));
        } else if (e.getKeyCode() == 37){
            this.player.setLookingLeft();
            this.player.setPos(new Position(this.player.getPos().x() - 1, this.player.getPos().y()));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

}
