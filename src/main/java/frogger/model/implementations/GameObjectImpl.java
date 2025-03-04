package frogger.model.implementations;

import frogger.common.Pair;
import frogger.common.Position;
import frogger.model.interfaces.GameObject;

public abstract class GameObjectImpl implements GameObject {
    private final Position starPosition = new Position(0, 0);

    private Position pos;
    private final Pair dimension;

    public GameObjectImpl(Position pos, Pair dimension) {
        this.pos = pos;
        this.dimension = dimension;
    }

    @Override
    public Position getPos() {
        return pos;
    }

    @Override
    public void setPos(Position pos) {
        this.pos = pos;
    }

    @Override
    public Pair getDimension() {
        return dimension;
    }

    @Override
    public void resetPosition() {
        this.pos = this.starPosition;
    }
}
