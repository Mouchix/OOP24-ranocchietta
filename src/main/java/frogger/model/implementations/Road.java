package frogger.model.implementations;

import frogger.common.Direction;
import frogger.model.interfaces.Car;
import frogger.model.interfaces.MovingObject;

public class Road extends AbstractLaneImpl {

    public Road(int speed, Direction direction) {
        super(speed, direction);
    }

    @Override
    public void addCar(MovingObject obstacle) {
        super.obstacles.add((Car)obstacle);
    }

    @Override
    public void addTrunk(MovingObject obstacle) {
        throw new IllegalStateException("Wrong type of obstacle.");
    }
    
}
