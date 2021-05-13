
package application;
import java.io.FileWriter;
import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class GraphicsController {
    @FXML
    private TextField TextField2;

    @FXML
    private TextField TextField1;

    @FXML
    private void saveMe(ActionEvent event) throws IOException {
    String s1=TextField1.getText().toString()+"\t";
    String s2=TextField2.getText().toString()+"\n";
    FileWriter file=new FileWriter("V:\\info.txt",true);
    file.write(s1+"\t");
    file.write(s2);
    file.write(System.getProperty("line.separator"));
    file.close();
    TextField1.clear();
    TextField2.clear();
    Alert alert=new Alert(AlertType.CONFIRMATION);
    alert.showAndWait();
   // W.close();
    

    }

}
