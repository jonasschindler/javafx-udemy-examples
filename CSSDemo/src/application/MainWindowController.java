package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

public class MainWindowController {
	
	@FXML Region region;
	@FXML Button okButton, CancelButton;
	@FXML TextField firstNameField, lastNameField, emailField;
	@FXML Label titleLabel, firstNameLabel, lastNameLabel, emailLabel;
	
	private Main main;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	public void handleOk() {
		System.out.println("okay");
		firstNameField.setId("textField");
		lastNameField.setId("textField");
		emailField.setId("textField");
	}
	
	public void handleCancel() {
		System.out.println("cancel");
	}

}
