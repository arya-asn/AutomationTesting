package DemoWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	public WebDriver driver;
	public void initializeBrowser() {
		driver = new EdgeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		
	}
	public void driverQuit() {
		driver.close();
	}

	public static void main(String[] args) {
		Base base = new Base();
		base.initializeBrowser();
		//base.driverQuit();
		
	}

}
