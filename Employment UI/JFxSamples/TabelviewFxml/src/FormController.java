import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FormController implements Initializable {

    //linking table to fxml
    @FXML
    TableView<Student> tableView = new TableView<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initialTable();
    }

    public void initialTable(){

        //creating Columns
        TableColumn<Student,String> nameCol = new TableColumn<>("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));


        TableColumn<Student,String> lastnameCol = new TableColumn<>("Last name");
        lastnameCol.setCellValueFactory(new PropertyValueFactory<>("lastname"));


        TableColumn<Student,String> idCol = new TableColumn<>("Id");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));


        TableColumn<Student,String> averageCol = new TableColumn<>("Average");
        averageCol.setCellValueFactory(new PropertyValueFactory<>("average"));

        //adding columns to tableview
        tableView.getColumns().addAll(nameCol,lastnameCol,idCol,averageCol);

        //making array of data
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new StudentBuilder().setName("reza").setLastname("ghanbari").setId("1").setAverage("18").createStudent());
        studentArrayList.add(new StudentBuilder().setName("ali").setLastname("riazi").setId("2").setAverage("18").createStudent());
        studentArrayList.add(new StudentBuilder().setName("mohammad").setLastname("fazi").setId("3").setAverage("19").createStudent());

        //adding data to tableview
        for(Student temp: studentArrayList){
            tableView.getItems().add(temp);
        }

    }



}
