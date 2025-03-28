package frogger.common;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Constants {
    //scale the dimention of the frame 
    private final static Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    private final static int sw = (int) screen.getWidth();
    private final static  int sh = (int) screen.getHeight();
    private final static double scale = 0.8;

    public final static int MIN_OBSTACLES_NUMBER = 2;
    public final static int MAX_OBSTACLES_NUMBER = 3;

    public final static int MIN_CAR_WIDTH = 1;
    public final static int MAX_CAR_WIDTH = 1;

    public final static int MIN_TRUNK_WIDTH = 1;
    public final static int MAX_TRUNK_WIDTH = 1;

    public final static int OBJECT_HEIGHT = 1;

    public final static int LANE_HEIGHT = 1;

    public final static int MAX_X = 6;
    public final static int MIN_X = -7;
    public final static int MAX_Y = 6;
    public final static int MIN_Y = -6;
    public final static int ROAD_LANES = 5;
    public final static int RIVER_LANES = 5;
    public final static int N_ROW = ROAD_LANES + RIVER_LANES + 3;
    public final static int N_COLUMN = Math.abs(MAX_X) + Math.abs(MIN_X) + 1;

    public final static int FRAME_WIDTH = (int) (sw / N_COLUMN * N_ROW * scale);
    public final static int FRAME_HEIGHT = (int) (sh / N_ROW * N_COLUMN * scale);
    
    public final static int BLOCK_WIDTH = FRAME_WIDTH / N_COLUMN;
    public final static int BLOCK_HEIGHT = FRAME_HEIGHT / N_ROW;

    public final static int PLAYER_WIDTH = 1;
    public final static int PLAYER_HEIGHT = 1;

    public final static int POINT_PER_LANE = 10;
    public final static int POINT_LEVEL_COMPLETED = 100;
}