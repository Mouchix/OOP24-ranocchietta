package frogger.model.implementations;

import frogger.common.Direction;
import frogger.common.Pair;
import frogger.common.Position;
import frogger.model.interfaces.PlayerObject;

public class PlayerObjectImpl extends GameObjectImpl implements PlayerObject{

    private Direction direction = Direction.UP;
    private int lives;
    private int score;

    public PlayerObjectImpl(Position pos, Pair dimension) {
        super(pos, dimension);
    }

    @Override
    public int getLives() {
        return this.lives;
    }

    @Override
    public void getHit() {
        this.lives--;
    }

    @Override
    public Direction getDirection() {
        return this.direction;
    }

    @Override
    public void setLookingRight() {
        this.direction = Direction.RIGHT;
    }

    @Override
    public void setLookingLeft() {
        this.direction = Direction.LEFT;
    }

    @Override
    public void setLookingDown() {
        this.direction = Direction.DOWN;
    }

    @Override
    public void setLookingUp() {
        this.direction = Direction.UP;
    }

    @Override
    public void addPoints(int points) {
        this.score+=points;
    }

    @Override
    public int getScore() {
        return this.score;
    }
}
