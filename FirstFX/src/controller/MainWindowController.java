package controller;

import model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class MainWindowController {
	
	// Views
	@FXML TableView<Person> tableView;
	@FXML TableColumn<Person, String> firstNameColumn;
	@FXML TableColumn<Person, String> lastNameColumn;
	@FXML TableColumn<Person, String> ageColumn;
	
	private ObservableList<Person> personList = FXCollections.observableArrayList();
	
	private Main main;
	private Stage primaryStage;
	
	public void initialize() {
		firstNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
		lastNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
		ageColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("age"));
	}
	
	public void setMain(Main main, Stage primaryStage) {
		this.main = main;
		this.primaryStage = primaryStage;
		setTableData();
		tableView.setItems(personList);
	}
	
	public void setTableData() {
		personList.add(new Person("Charlie","Brown", "25"));
		personList.add(new Person("Joe","Cocker", "70"));
	    personList.add(new Person("Dr","Frankenstein", "62"));
	    personList.add(new Person("Steve","Jobs", "49"));
	    personList.add(new Person("Fred","Feuerstein", "42"));
	    personList.add(new Person("Abraham","Lincoln", "104"));
	    personList.add(new Person("Paul","Auster", "56"));
	    personList.add(new Person("Homer","Simpson", "48"));
	    personList.add(new Person("Jack","Sparrow", "39"));
	}
	
	public void closeWindow() {
		primaryStage.close();
	}

}
