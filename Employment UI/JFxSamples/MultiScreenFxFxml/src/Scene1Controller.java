import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {
    private String data = new String("data transferred");


    public void goToScreen2OnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Scene2.fxml"));
        Parent root = loader.load();

        //getting the controller
        Scene2Controller scene2Controller = loader.getController();

        //setting data
        scene2Controller.setData(data);


        Scene scene = new Scene(root);
        Stage window = (Stage)(((Node)event.getSource()).getScene().getWindow());
        window.setScene(scene);
    }


}
