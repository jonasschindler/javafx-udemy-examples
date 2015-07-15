package application;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;

public class MainWindowController {
	
	private Main main;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	public void showAlert1() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information");
		alert.setHeaderText("Information header text");
		alert.setContentText("This is the information text that is displayed to the user");
		alert.showAndWait();
	}
	
	public void showAlert2() {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("Warning");
		alert.setHeaderText("Warning header");
		alert.setContentText("A serious warning");
		alert.showAndWait();
	}
	
	public void showAlert3() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation");
		alert.setHeaderText("Confirmation");
		alert.setContentText("I confirm this notice");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK) {
			System.out.println("Ok clicked");
		} else {
			System.out.println("Cancel clicked");
		}
	}
	
	public void showAlert4() {
		TextInputDialog dialog = new TextInputDialog();
		dialog.setTitle("Input");
		dialog.setContentText("Please enter your age: ");
		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			System.out.print("Age: "+result.get());
		} else {
			System.out.print("No input");
		}
	}

}
