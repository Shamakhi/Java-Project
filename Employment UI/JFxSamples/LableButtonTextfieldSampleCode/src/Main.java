import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {
    /**
     * this method will start the program and first form will load and show
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        //changing the name for better understanding
        Stage window = primaryStage;

        //making a label node
        Label label = new Label("Hi");
        label.setFont(new Font(28));

        //making a textfield node
        TextField textField = new TextField() ;
        textField.setPromptText("Type ...");
        textField.setMaxWidth(500);

        //making a button node
        Button button = new Button("Write");

        //setting action for button this code be done by lambda too
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(textField.getText());
            }
        });
        //making a root container here vbox is better
        VBox vBox = new VBox(label,textField,button);
        vBox.setPrefSize(800,600);

        //setting space between nodes
        vBox.setSpacing(10);

        //setting nodes margins
        VBox.setMargin(textField,new Insets(30,20,50,20));
        VBox.setMargin(label,new Insets(30,20,50,20));
        vBox.setAlignment(Pos.TOP_CENTER);

        //making a scene for nodes and passing root container in constructor
        Scene scene = new Scene(vBox);

        //setting the scene
        window.setScene(scene);

        //play
        window.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
