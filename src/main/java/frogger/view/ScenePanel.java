package frogger.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import frogger.controller.ControllerImpl;

public class ScenePanel extends JPanel{
    ControllerImpl controller = new ControllerImpl();

    public ScenePanel() {
        setPanelSize();
        setBackground(Color.BLACK);
    }

    private void setPanelSize() {
        setPreferredSize(new Dimension(600, 800));
    }

    @Override
    public void paintComponent(final Graphics g) {
        
        // for(var obstacle : controller.getGame().getObstacles()) {
        //     g.setColor(Color.RED);
        //     g.fillRect(obstacle.getPos().x(), obstacle.getPos().y(), obstacle.getDimension().width(), obstacle.getDimension().height());
        // }
        super.paintComponent(g);
    }

}
