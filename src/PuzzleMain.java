import controllers.PuzzleController;
import model.PuzzleModel;
import views.PuzzleView;

/**
 * Created by hp on 12/9/2014.
 */
public class PuzzleMain {

    public static void main(String[] args){

        //Instantiate the MVC elements

        PuzzleModel model = new PuzzleModel();
        PuzzleController controller = new PuzzleController();
        PuzzleView view = new PuzzleView(model, controller);


        //Attach the view to the model
        model.addModelListener(view);

        //Tell the controller about the model and the view
        controller.addModel(model);
        controller.addView(view);

        //Just Display the view
        view.setVisible(true);

    }
}
