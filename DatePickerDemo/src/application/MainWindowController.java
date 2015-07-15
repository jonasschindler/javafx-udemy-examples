package application;

import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

public class MainWindowController {
	
	@FXML private DatePicker datePicker;
	private Main main;
	
	public void setMain(Main main) {
		this.main = main;
		datePicker.setValue(LocalDate.now());
		datePicker.setOnAction(event -> {
			LocalDate date = datePicker.getValue();
			System.out.println("date: "+date);
		});
	}
}