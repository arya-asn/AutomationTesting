package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends BaseClass{

	public static void main(String[] args) {
		RadioButton radiobutton = new RadioButton();
		radiobutton.initializeBrowser();
		radiobutton.Radiobutton();
		
	}
	public void Radiobutton() {
		WebElement radio1= driver.findElement(By.xpath("//input[@value='green']"));
		radio1.click();
		//System.out.println(radio1.isSelected());
		//System.out.println(radio1.isEnabled());
		//System.out.println(radio1.isDisplayed());
		
	}

}
