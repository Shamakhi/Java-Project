package sample;

/* Author :
    Abolfazl Shamakhi - dey 1399
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Employment UI");
        primaryStage.setScene(new Scene(root, 240, 250));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("../sample/13.jpg")));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
