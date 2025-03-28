package frogger.common.input;

import frogger.common.Constants;
import frogger.common.Position;
import frogger.model.implementations.GameImpl;
import frogger.model.interfaces.PlayerObject;

public class MoveDown implements Command{

    @Override
    public void execute(GameImpl game) {
        PlayerObject player = game.getPlayer();
		if(player.getPos().y() > Constants.MIN_Y){
            player.setLookingDown();
			player.setPos(new Position(player.getPos().x(), player.getPos().y() - 1));
		}
    }

}
