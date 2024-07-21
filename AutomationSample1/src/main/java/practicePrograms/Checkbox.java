package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends BaseClass{

	public static void main(String[] args) {
		Checkbox checkbox=new Checkbox();
		checkbox.initializeBrowser();
		checkbox.checkBox();
		

	}
	public void checkBox() {
		WebElement option = driver.findElement(By.xpath("//input[@value='option-1']"));
		option.click();
		System.out.println(option.isSelected());
		WebElement option1 = driver.findElement(By.xpath("//input[@value='option-4']"));
		System.out.println(option1.isSelected());
		
	}
}
