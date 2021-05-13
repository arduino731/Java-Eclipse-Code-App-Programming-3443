package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;

public class PieChartModel {
	private PieChart piechart;
	
	private ObservableList array;
	//PieChart.Data[] data=new PieChart.Data[5];
	
	//PieChartModel(ObservableList listofItems){
		//ObservableList array=listofItems;
		//Object[] array;
	    //array = (Object[])listofItems.toArray();
		//int[] values={10,20,30,40,50};
		
		//for(int i=0;i<5;i++){
			//data[i]=new PieChart.Data((String) array[i], values[i]);
		//}
		
	//}
//	PieChart pie_chart = new
  //          PieChart(FXCollections.observableArrayList(data)); 

	
	ObservableList<PieChart.Data> pieChartData =
           FXCollections.observableArrayList(
           new PieChart.Data("Vogue", 13),
           new PieChart.Data("Time", 25),
           new PieChart.Data("Fortune", 10),
           new PieChart.Data("Elle", 22),
           new PieChart.Data("Others", 30));
	
	//PieChart chart = new PieChart(pieChartData);
	}