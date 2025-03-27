package frogger.model.implementations;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import frogger.common.Constants;
import frogger.common.Pair;
import frogger.common.Position;
import frogger.model.interfaces.GameObject;

public abstract class GameObjectImpl implements GameObject {
    private Position pos;
    private final Pair dimension;
    protected Rectangle hitbox;
    private BufferedImage img;

    public GameObjectImpl(Position pos, Pair dimension) {
        this.pos = pos;
        this.dimension = dimension;
        
        initHitBox();
    }

    private void initHitBox() {
        this.hitbox = new Rectangle((int) this.pos.x(), (int) this.pos.y(), this.dimension.width(), this.dimension.height());
    }

    protected void updateHitBox(){
        this.hitbox.x = Math.round(this.pos.x());
        this.hitbox.y = Math.round(this.pos.y());
    }

    @Override
    public Rectangle getHitBox(){
        return this.hitbox;
    }

    public void drawHitBox(Graphics g, float x, float y){
        g.setColor(Color.PINK);
        g.drawRect((int)x, (int)y, this.hitbox.width * Constants.BLOCK_WIDTH, this.hitbox.height * Constants.BLOCK_HEIGHT);
    }

    @Override
    public Position getPos() {
        return this.pos;
    }

    @Override
    public void setPos(Position pos) {
        this.pos = pos;
        updateHitBox();
    }

    @Override
    public Pair getDimension() {
        return dimension;
    }

    @Override
    public void render(Graphics g, int x, int y) {
        g.drawImage(img, x, y, this.getDimension().width() * Constants.BLOCK_WIDTH, 
        this.getDimension().height() * Constants.BLOCK_HEIGHT, null);
    }

    public void setImage(InputStream is) {
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
