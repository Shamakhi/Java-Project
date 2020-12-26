import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;

        //first scene
        Button firstSceneButton = new Button("go to scene 2");
        Label firstScenelabel = new Label("first Scene");
        firstScenelabel.setFont(new Font(40));
        VBox vBox = new VBox(firstScenelabel,firstSceneButton);
        vBox.setSpacing(30);
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setPrefSize(800,600);
        Scene firstScene = new Scene(vBox);


        //second scene
        Button secondSceneButton = new Button("back to scene 1");
        Label secondScenelabel = new Label("second Scene");
        secondScenelabel.setFont(new Font(40));
        VBox vBox2 = new VBox(secondScenelabel,secondSceneButton);
        vBox2.setSpacing(30);
        vBox2.setAlignment(Pos.TOP_CENTER);
        vBox2.setPrefSize(800,600);
        Scene secondScene = new Scene(vBox2);



        firstSceneButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.setScene(secondScene);
            }
        });


        secondSceneButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.setScene(firstScene);
            }
        });



        window.setScene(firstScene);
        window.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
