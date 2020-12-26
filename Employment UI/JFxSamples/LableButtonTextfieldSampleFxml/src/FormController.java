import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class FormController {
    //here we declare nodes and link them to fxml file
    @FXML
    TextField textField;
    @FXML
    Label label;
    @FXML
    Button button;

    /**
     * this method will be the button action
     */

    public void buttonAction(){
        label.setText(textField.getText());
    }

}
