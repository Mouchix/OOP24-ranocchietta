package frogger.view;

import javax.swing.JFrame;

import frogger.common.Constants;

public class GameScene {
    private JFrame frame;
    
    public GameScene(ScenePanel panel) {
        frame = new JFrame("Ranocchietta");

        frame.setSize(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        
        this.frame.getContentPane().add(panel);
        panel.requestFocus();
        
        // frame.setLocationByPlatform(true);
        // frame.setLocation((int)screen.getWidth()/2 - Constants.FRAME_WIDTH / 2, 0);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
