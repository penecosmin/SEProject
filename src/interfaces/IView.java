package interfaces;

/**
 * The View interface
 */
public interface IView {

    /**
     * On message received from controller
     *
     * @param isError {@code true} if the message is an error, {@code false} otherwise
     * @param message The string to be displayed
     */
    public void onMessage(boolean isError, String message);
}
