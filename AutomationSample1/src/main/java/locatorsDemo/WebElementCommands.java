package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base  {

	public static void main(String[] args) {
		WebElementCommands command = new WebElementCommands();
		command.initializeBrowser();
		command.commandsOne();
		command.commandsTwo();
		

	}
	public void commandsOne() {
		WebElement inputForm=driver.findElement(By.xpath("(//a[@href='simple-form-demo.php'])[1]"));
		inputForm.click();
		WebElement clickmessage=driver.findElement(By.id("single-input-field"));
		clickmessage.sendKeys("Addition");
		WebElement showMessage=driver.findElement(By.id("button-one"));
		showMessage.click();
		System.out.println(showMessage.getText());
	}
	
	public void commandsTwo() {
		WebElement inputValue1=driver.findElement(By.id("value-a"));
		inputValue1.sendKeys("64");
		WebElement inputValue2=driver.findElement(By.id("value-b"));
		inputValue2.sendKeys("36");
		WebElement GetTotal=driver.findElement(By.id("button-two"));
		GetTotal.click();
	}

}
