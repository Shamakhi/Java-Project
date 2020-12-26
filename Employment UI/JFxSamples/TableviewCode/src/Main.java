import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;


public class Main extends Application {
    /**
     * this method will start the program and first form will load and show
     * @param primaryStage
     * @throws Exception
     */

    @Override
    public void start(Stage primaryStage) throws Exception {


        Stage window = primaryStage;

        //creating Columns
        TableColumn<Student,String> nameCol = new TableColumn<>("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));


        TableColumn<Student,String> lastnameCol = new TableColumn<>("Last name");
        lastnameCol.setCellValueFactory(new PropertyValueFactory<>("lastname"));


        TableColumn<Student,String> idCol = new TableColumn<>("Id");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));


        TableColumn<Student,String> averageCol = new TableColumn<>("Average");
        averageCol.setCellValueFactory(new PropertyValueFactory<>("average"));

        //creating tableview
        TableView<Student> tableView = new TableView<>();

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

        //making root container and passing tableview in constructor
        VBox vBox = new VBox(tableView);

        //making scene and passing root in constructor
        Scene scene = new Scene(vBox);

        //setting scene
        window.setScene(scene);

        //play
        window.show();

    }

}
