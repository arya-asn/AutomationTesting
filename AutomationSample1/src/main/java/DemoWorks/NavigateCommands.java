package DemoWorks;

public class NavigateCommands extends Base{
	
	public void navigateCommands() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	

	public static void main(String[] args) {
		NavigateCommands navigateCommands= new NavigateCommands();
		navigateCommands.initializeBrowser();
		navigateCommands.navigateCommands();
		

	}

}
