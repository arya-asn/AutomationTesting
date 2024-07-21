package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert_Handling extends Base{

	public static void main(String[] args) {
		Alert_Handling alerthandling = new Alert_Handling();
		alerthandling.initializeBrowser();
		alerthandling.alertHandling();

	}
	public void alertHandling() {
		WebElement alertmodal= driver.findElement(By.id("alert-modal"));
		alertmodal.click();
		WebElement javascriptalert = driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
		javascriptalert.click();
		WebElement clickme= driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickme.click();
		driver.switchTo().alert().accept();
		
		
		WebElement clickme2= driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickme2.click();
		//driver.switchTo().alert().accept();
		//System.out.println("Accepted");
		driver.switchTo().alert().dismiss();
		System.out.println("Dismissed");
		
		
		WebElement clickPromptBox = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickPromptBox.click();
		driver.switchTo().alert().sendKeys("Arya");
		driver.switchTo().alert().accept();
	}
	
	

}
