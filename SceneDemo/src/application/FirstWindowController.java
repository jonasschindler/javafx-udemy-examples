package application;

public class FirstWindowController {
	
	private Main main;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	public void openNewWindow() {
		System.out.println("new window");
		main.secondWindow();
	}
	
	public void changeWindow() {
		System.out.println("change the window");
		main.changeWindow();
	}

}
