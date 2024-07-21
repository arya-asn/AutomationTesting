package locatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements_Ex extends Base{

	public static void main(String[] args) {
		FindElements_Ex find_element= new FindElements_Ex();
		find_element.initializeBrowser();
		find_element.find_element();

	}
	public void find_element() {
		WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		List<WebElement> find=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement option:find) {
			option.sendKeys("Hello");
		}
	}

}
