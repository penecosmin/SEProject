package interfaces;

import java.awt.event.ActionListener;

/**
 * The controller interface that extends the Action Listener
 */
public interface IController extends ActionListener {

    /**
     * We defined two basic actions : moving a piece and resetting the game
     */

    public static final String ACTION_MOVE_PIECE = "MOVE_PIECE";
    public static final String ACTION_RESET = "RESET";
}
