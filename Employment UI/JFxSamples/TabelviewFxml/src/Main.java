import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * this method will start the program and first form will load and show
     * @param primaryStage
     * @throws Exception
     */

    @Override
    public void start(Stage primaryStage) throws Exception {


        Stage window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Form.fxml"));
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }
}
