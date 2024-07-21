package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Base {

	public static void main(String[] args) {
		Dropdown dropdown= new Dropdown();
		dropdown.initializeBrowser();
		dropdown.selectInput();
		dropdown.selectColor();

	}
	public void selectInput() {
		WebElement inputForm=driver.findElement(By.xpath("(//a[@href='simple-form-demo.php'])[1]"));
		inputForm.click();
		WebElement selectInput=driver.findElement(By.xpath("//a[@href='select-input.php']"));
		selectInput.click();
		}
	public void selectColor() {
		WebElement selectColorDropdown= driver.findElement(By.id("single-input-field"));
		Select select = new Select(selectColorDropdown);
		//select.selectByVisibleText("Red");
		//select.selectByValue("Yellow");
		select.selectByIndex(3);
		
	}

}
