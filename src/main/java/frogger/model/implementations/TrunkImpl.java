package frogger.model.implementations;

import frogger.common.Direction;
import frogger.common.Pair;
import frogger.common.Position;
import frogger.model.interfaces.Trunk;

public class TrunkImpl extends MovingObjectImpl implements Trunk{

    public TrunkImpl(Position pos, Pair dimension, float speed, Direction direction) {
        super(pos, dimension, speed, direction);
    }

}
