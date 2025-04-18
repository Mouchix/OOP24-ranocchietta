package frogger.model.implementations;

import frogger.common.Direction;
import frogger.model.interfaces.MovingObject;

public class River extends AbstractLaneImpl {

    public River(float speed, Direction direction) {
        super(speed, direction);
    }

    @Override
    public void addCar(MovingObject obstacle) {
        throw new IllegalStateException("Wrong type of obstacle.");    
    }

    @Override
    public void addTrunk(final MovingObject obstacle) {
        super.obstacles.add((Trunk)obstacle);
    }
}
