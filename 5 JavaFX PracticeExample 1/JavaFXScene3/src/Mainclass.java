import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Mainclass extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btn=new Button("Click me");
		btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				System.out.println("Hello World");
		}
		});
		StackPane root=new StackPane();
		root.getChildren().add(btn);
		Scene scene = new Scene(root, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	

}
