package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SampleController {
	@FXML
	private Label myMessage;
	private int startingNumber;
	public void display(ActionEvent event){
		myMessage.setText(addOne());
	   
	}
	private String addOne() {
        startingNumber += 1;
        return Integer.toString(startingNumber);
    }

      
}

