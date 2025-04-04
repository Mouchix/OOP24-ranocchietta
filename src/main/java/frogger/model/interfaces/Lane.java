package frogger.model.interfaces;

import java.util.Set;

import frogger.common.Direction;

public interface Lane {
    void addMovingObject(MovingObject obstacle);

    float getSpeed();

    Direction getDirection();

    Set<MovingObject> getLaneObstacles();

    boolean isCompleted();

    void setCompleted();
}
