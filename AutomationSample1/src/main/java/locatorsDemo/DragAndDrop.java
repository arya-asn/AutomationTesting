package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base{

	public static void main(String[] args) {
		DragAndDrop draganddrop = new DragAndDrop();
		draganddrop.initializeBrowser();
		draganddrop.dragAndDrop();

	}
	public void dragAndDrop() {
		WebElement others = driver.findElement(By.id("others"));
		others.click();
		WebElement drag = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drop = driver.findElement(By.id("mydropzone"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
	}
	

}
