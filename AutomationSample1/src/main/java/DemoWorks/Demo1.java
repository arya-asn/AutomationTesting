package DemoWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {	
	WebDriver driver;
	public void details() {
		//driver = new ChromeDriver();
		driver = new EdgeDriver();
		//driver = new FirefoxDriver();		
	}
	
	public static void main(String[] args) {
		Demo1 demo = new Demo1();
		demo.details();
	}

}
