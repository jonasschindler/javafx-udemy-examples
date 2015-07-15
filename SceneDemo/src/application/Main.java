package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	private Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		firstWindow();
	}
	
	public void firstWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("FirstWindowView.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			FirstWindowController firstWindowController = loader.getController();
			firstWindowController.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void secondWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("SecondWindowView.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			Stage secondaryStage = new Stage();
			
			SecondWindowController secondWindowController = loader.getController();
			secondWindowController.setMain(this, secondaryStage);
			
			secondaryStage.initOwner(primaryStage);
			secondaryStage.initModality(Modality.WINDOW_MODAL);
			
			secondaryStage.setScene(scene);
			secondaryStage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void changeWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("ChangeWindowView.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			ChangeWindowController changeWindowController = loader.getController();
			changeWindowController.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
