package locatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FullTable_Handling extends Base{

	public static void main(String[] args) {
		FullTable_Handling fulltablehandling = new FullTable_Handling();
		fulltablehandling.initializeBrowser();
		fulltablehandling.fullTable();
		System.out.println("--------------------------------");
		fulltablehandling.selectRow();
		System.out.println("--------------------------------");
		fulltablehandling.selectParticularData();
		System.out.println("--------------------------------");
		fulltablehandling.searchElement();
		System.out.println("--------------------------------");
		fulltablehandling.selectColumn();
		

	}
	public void fullTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
		
	}
	public void selectRow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println(row.getText());
	}
	public void selectParticularData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement data = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]/td[2]"));
		System.out.println(data.getText());
		
	}
	public void searchElement() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String inputData="Tiger Nixon";
		List<WebElement> searchElement = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement element: searchElement) 
		{
			if(element.getText().equals(inputData)) {
				System.out.println(element.getText());
			}
		}
		
	}
	public void selectColumn() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> coulmn = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for (WebElement option: coulmn){
			System.out.println(option.getText());
		}
	}
	
}
