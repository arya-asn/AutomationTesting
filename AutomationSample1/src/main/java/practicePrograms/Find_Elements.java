package practicePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Find_Elements extends BaseClass{

	public static void main(String[] args) {
		Find_Elements findElement=new Find_Elements();
		findElement.initializeBrowser();
		findElement.find_elements();

	}
	public void find_elements() {
		
		List<WebElement> find = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement option:find) {
			option.click();
			System.out.println(option.isSelected());
		}
	}
	}


