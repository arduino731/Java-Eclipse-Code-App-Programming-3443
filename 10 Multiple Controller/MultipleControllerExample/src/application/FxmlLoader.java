package application;



import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class FxmlLoader {
	private Pane view;
	public Pane getPage(String fileName){
		
		try{
			URL fileUrl=Main.class.getResource(fileName+".fxml");
			System.out.println(fileUrl);
			if(fileUrl==null){
				throw new java.io.FileNotFoundException("FXML file can't be found");
			}
			//new FXMLLoader();
			view=FXMLLoader.load(fileUrl);
		}
		catch(Exception e){
			System.out.println("No page "+fileName+" please check FXMLLoader.");
		}
		
		return view;			
		
	}
}
