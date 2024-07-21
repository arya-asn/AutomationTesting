package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemos extends BaseClass {

	public static void main(String[] args) {
		DropdownDemos dropdownDemos = new DropdownDemos();
		dropdownDemos.initializeBrowser();
		dropdownDemos.dropDownMenu1();
		dropdownDemos.dropDownMenu2();
		dropdownDemos.dropDownMenu3();

	}
	public void dropDownMenu1() {
	WebElement dropdown1= driver.findElement(By.id("dropdowm-menu-1"));
	Select select1=new Select(dropdown1);
	select1.selectByVisibleText("SQL");
	//select1.selectByValue("python");
	//select1.selectByIndex(1);
	}
	public void dropDownMenu2() {
		WebElement dropdown2= driver.findElement(By.id("dropdowm-menu-2"));
		Select select2=new Select(dropdown2);
		//select2.selectByVisibleText("Maven");
		select2.selectByValue("testng");
		//select2.selectByIndex(3);
		}
	
	public void dropDownMenu3() {
		WebElement dropdown3= driver.findElement(By.id("dropdowm-menu-3"));
		Select select3=new Select(dropdown3);
		//select3.selectByVisibleText("CSS");
		//select3.selectByValue("javascript");
		select3.selectByIndex(3);
		}
	

}
