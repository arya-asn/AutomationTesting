package practicePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import locatorsDemo.Base;

public class BaseClass {
	public WebDriver driver;
	public void initializeBrowser() {
		driver = new EdgeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
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
