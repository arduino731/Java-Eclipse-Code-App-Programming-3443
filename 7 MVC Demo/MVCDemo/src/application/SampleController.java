package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class SampleController {
    @FXML
    private TextField output;
   private long number1 = 0;
   private String operator = "";
   private boolean start = true;

   private Model model = new Model();

   @FXML
   private void process(ActionEvent event) {
       if (start) {
           output.setText("");
           start = false;
       }

       String value = ((Button)event.getSource()).getText();
       output.setText(output.getText() + value);
   }

   @FXML
   private void operate(ActionEvent event) {
       String value = ((Button)event.getSource()).getText();

       if (!"=".equals(value)) {
           if (!operator.isEmpty())
               return;

           operator = value;
           number1 = Long.parseLong(output.getText());
           output.setText("");
       }
       else {
           if (operator.isEmpty())
               return;

           output.setText(String.valueOf(model.calculate(number1, Long.parseLong(output.getText()), operator)));
           operator = "";
           start = true;
       }
   }

}