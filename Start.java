package lab7;
/* Nathaniel Snyder
 * Christian Chaiyaphum
 * 10-20-2018
 * Start Class 
 * this class will control the starting/ending operation for the game.
 * 
 * 
 * 
 */

//start class


	import javafx.application.Application;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.layout.StackPane;
	import javafx.stage.Stage;
	
	
	//start class 
	public class Start extends Application {
	    
	    @Override
	    public void start(Stage primaryStage) {
	        Button btn = new Button();
	        btn.setText("Start The Game");
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	 
	            @Override
	            //start the game.
	            public void handle(ActionEvent event) {
	                System.out.println("Game Started");
	                Game.game();
	            }
	        });
	        
	        StackPane root = new StackPane();
	        root.getChildren().add(btn);

	 Scene scene = new Scene(root, 300, 250);

	        primaryStage.setTitle("Game Start");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }
	 public static void main(String[] args) {
	        launch(args);
	    }
	}
	
	
	
}//end Start class
