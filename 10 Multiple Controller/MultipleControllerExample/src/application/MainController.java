package application;

import javafx.fxml.Initializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class MainController implements Initializable {
    @FXML
    private Label label;
    
    @FXML
    private BorderPane mainPane;
    
    @FXML
    private void handleScreen1Action(ActionEvent event) {
    System.out.println("You clicked me");
    FxmlLoader object=new FxmlLoader();
    Pane view=object.getPage("Screen1");
    mainPane.setCenter(view);
    
    }

    @FXML
    private void handleScreen2Action(ActionEvent event) throws FileNotFoundException {
    	System.out.println("You clicked me");
        FxmlLoader object=new FxmlLoader();
        Pane view=object.getPage("Screen2");
        mainPane.setCenter(view);
        FileInputStream input = new FileInputStream("V:\\Desert.jpg"); 
		  
        // create a image 
        Image i = new Image(input); 
  
        // create a image View 
        ImageView iw = new ImageView(i); 
  
        // create a button 
        Button b = new Button("", iw);
        mainPane.getChildren().add(b);
        mainPane.getChildren().remove(b);
    }

    @FXML
    private void handleScreen3Action(ActionEvent event) {
    	//mainPane.getChildren().removeAll();
    	System.out.println("You clicked Screen 3");
        Circle cir=new Circle(100,100,30, Color.AQUAMARINE);
		//cir.setRadius(30);
		//cir.setLayoutX(50);
		//cir.setLayoutX(50);
		TranslateTransition transition=new TranslateTransition();
		transition.setDuration(Duration.seconds(3));
		transition.setToX(200);
	    transition.setToY(200);
	    transition.setNode(cir);
	    transition.setAutoReverse(true);
	    transition.setCycleCount(Animation.INDEFINITE);
	    //transition.setCycleCount(1);
	    transition.play();
	    FxmlLoader object=new FxmlLoader();
        Pane view=object.getPage("Screen3");
        mainPane.setCenter(view);
        mainPane.getChildren().add(cir);
    }
    
    @FXML
    private void handleScreen4Action(ActionEvent event) {
    	
    	Rectangle rect1=new Rectangle(100,0,400,1);
    	rect1.setFill(Color.VIOLET);
    	
    	Rectangle rect2=new Rectangle(100,399,400,1);
    	rect2.setFill(Color.BLACK);
    	
        ScaleTransition rect1T=new ScaleTransition(Duration.seconds(1),rect1);
        rect1T.setToY(400);
        rect1T.setCycleCount(1);
        rect1T.play();
        
        ScaleTransition rect2T=new ScaleTransition(Duration.seconds(1),rect2);
        rect2T.setToY(-400);
        rect2T.setCycleCount(1);
        rect2T.play();
        
    	FxmlLoader object=new FxmlLoader();
    	Pane view=object.getPage("Screen4");
    	mainPane.getChildren().remove(mainPane.getCenter());
        mainPane.setCenter(view);
        mainPane.getChildren().addAll(rect1,rect2); 
      // mainPane.getChildren().removeAll(rect1,rect2);     
    }
    @FXML
    private void handleScreen5Action(ActionEvent event) {
    	System.out.println("You clicked me");
        FxmlLoader object=new FxmlLoader();
        Pane view=object.getPage("Screen5");
        mainPane.setCenter(view);
    }
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
		
	}

}
