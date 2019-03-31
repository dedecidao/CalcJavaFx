package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		
	Pane root = FXMLLoader.load(getClass().getResource("PrimeiraTela.fxml"));
	
	Scene scene = new Scene(root, 300, 200);
	primaryStage.setScene(scene);
	primaryStage.show();
	
	}//end stage
	
	public static void main(String[] args) {
		launch(args);
		//comentario
	}
}
