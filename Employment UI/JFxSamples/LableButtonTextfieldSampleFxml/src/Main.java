import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {
    /**
     * this method will start the program and first form will load and show
     * @param primaryStage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {

        //changing the stage name for better understanding
        Stage window =primaryStage;

        // making a parent root load fxml on it. Parent is superclass of containers
        Parent root = FXMLLoader.load(getClass().getResource("Form.fxml"));

        //making a root and passing the root container in constructor
        Scene scene = new Scene(root);

        //setting the scene
        window.setScene(scene);

        //play
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
