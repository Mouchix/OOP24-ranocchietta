package frogger.model.implementations;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import frogger.common.Constants;
import frogger.common.Pair;
import frogger.common.Position;
import frogger.model.interfaces.GameObject;

public abstract class GameObjectImpl implements GameObject {

    private Position pos;
    private final Pair dimension;
    protected Rectangle hitbox;

    public GameObjectImpl(Position pos, Pair dimension) {
        this.pos = pos;
        this.dimension = dimension;

        initHitBox();
    }

    private void initHitBox() {
        this.hitbox = new Rectangle((int) this.pos.x(), (int) this.pos.y(), this.dimension.width(), this.dimension.height());
    }

    protected void updateHitBox(){
        this.hitbox.x = (int) this.pos.x();
        this.hitbox.y = (int) this.pos.y();
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
        return pos;
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

}
