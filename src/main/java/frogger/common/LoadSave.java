package frogger.common;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class LoadSave{

    public static final String MENU_BUTTONS = "menuButtons.png";

    public static BufferedImage GetSprite(String fileName) {
        BufferedImage img = null;
        InputStream is = LoadSave.class.getResourceAsStream("/"+fileName);
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            System.err.println("Error closing InputStream: " + e.getMessage());
        } finally {
            try{
                is.close();
            } catch (IOException e) {
                System.err.println("Error closing InputStream in finally block: " + e.getMessage());
            }
        }

        return img;
    }
}