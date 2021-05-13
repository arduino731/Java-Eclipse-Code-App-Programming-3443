package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SampleController implements Initializable{
	@FXML
	private VBox vb;

    @FXML
    private ListView<String> listview;

    @FXML
    private TextArea textarea; 
    
    @FXML
    private PieChart piechart;

    @FXML
    private AnchorPane ap;

    @FXML
    void saveMe(ActionEvent event) {
    	String textareaString="";
    	ObservableList listofItems=listview.getSelectionModel().getSelectedItems();
    	for(Object item : listofItems){
    		textareaString+=String.format("%s%n", (String)item);
    	}
    	textarea.setText(textareaString);
    	//PieChartModel p=new PieChartModel(listofItems);
    	PieChartModel p=new PieChartModel();
		piechart.setData(p.pieChartData);
    	//piechart.setData((p.pie_chart);
    }

	@Override
       public void initialize(URL arg0, ResourceBundle arg1){
		// TODO Auto-generated method stub
		
		//listview.getItems().addAll("Vogue","Time","Elle","Fortune","Others");
		 listview.getItems().addAll("Vogue1","Time2","Elle2","Fortune2");
		 listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		 
		 
		 
		
	}

}