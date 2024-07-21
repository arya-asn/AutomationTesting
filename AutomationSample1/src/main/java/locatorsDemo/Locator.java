package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator extends Base{
	
	public static void main(String args) {
		
	}
	public void idLocator() {
		WebElement id =driver.findElement(By.id("single-input-field"));
		WebElement id1=driver.findElement(By.id("value-a"));
		WebElement id2=driver.findElement(By.id("value-b"));
		WebElement id3=driver.findElement(By.id("button-one"));
		WebElement id4=driver.findElement(By.id("button-two"));
		WebElement id5=driver.findElement(By.id("progress-bars"));
		WebElement id6=driver.findElement(By.id("message-one"));
		WebElement id7=driver.findElement(By.id("message-two"));
	}
	
	public void classLocator() {
		WebElement classname=driver.findElement(By.className("clearfix"));
		WebElement classname1=driver.findElement(By.className("copyright"));
		WebElement classname2=driver.findElement(By.className("header-top"));
		WebElement classname3=driver.findElement(By.className("mb-sec"));
		WebElement classname4=driver.findElement(By.className("navbar navbar-expand-md navbar-dark"));
		WebElement classname5=driver.findElement(By.className("collapse navbar-collapse"));
		WebElement classname6=driver.findElement(By.className("navbar-brand"));
		WebElement classname7=driver.findElement(By.className("container page"));
		WebElement classname8=driver.findElement(By.className("col-lg-9 col-md-9 col-sm-12 col-xs-12"));
		WebElement classname9=driver.findElement(By.className("col-lg-3 col-md-3 col-sm-12 col-xs-12"));
	

	}
	
	public void nameLocator() {
		WebElement name=driver.findElement(By.name("viewport"));
		WebElement name1=driver.findElement(By.name("description"));
		WebElement name2=driver.findElement(By.name("keywords"));
		WebElement name3=driver.findElement(By.name("author"));
		
	}
	
	public void linkLocator() {
		WebElement link=driver.findElement(By.linkText("simple-form-demo.php"));
		WebElement link1=driver.findElement(By.linkText("radio-button-demo.php"));
		WebElement link3=driver.findElement(By.linkText("check-box-demo.php"));
		WebElement link4=driver.findElement(By.linkText("select-input.php"));
		WebElement link5=driver.findElement(By.linkText("form-submit.php"));
		WebElement link6=driver.findElement(By.linkText("ajax-form-submit.php"));
		WebElement link7=driver.findElement(By.linkText("jquery-select.php"));
		
	}
	public void partialLinkLocator() {
		WebElement partialLink=driver.findElement(By.partialLinkText("simple-form"));
		WebElement partialLink1=driver.findElement(By.partialLinkText("radio-button"));
		WebElement partialLink2=driver.findElement(By.linkText("check-box"));
		WebElement partialLink3=driver.findElement(By.linkText("select-input"));
		WebElement partialLink4=driver.findElement(By.linkText("form-submit"));
		WebElement partialLink5=driver.findElement(By.linkText("ajax-form"));
		WebElement partialLink6=driver.findElement(By.linkText("jquery-select"));
	}
	
	//tag and id
	//tag and class
	//tag and attribute
	//tage,class and attribute

	public void cssSelector() {
		//tag and id
		WebElement select01= driver.findElement(By.cssSelector("input#single-input-field"));//tag#id
		WebElement select02= driver.findElement(By.cssSelector("button#button-one"));
		WebElement select03= driver.findElement(By.cssSelector("div#collapsibleNavbar"));
		WebElement select04= driver.findElement(By.cssSelector("a#progress-bars"));
		WebElement select05= driver.findElement(By.cssSelector("a#alert-modal"));
		WebElement select06= driver.findElement(By.cssSelector("a#list0box"));
		
		//tag and class
		WebElement select11= driver.findElement(By.cssSelector("input.form-control"));//tag.class
		WebElement select12= driver.findElement(By.cssSelector("div.top-logo"));//tag.class
		WebElement select13= driver.findElement(By.cssSelector("div.mb-sec"));//tag.class
		WebElement select14= driver.findElement(By.cssSelector("button.navbar-toggler"));//tag.class
		WebElement select15= driver.findElement(By.cssSelector("ul.navbar-nav"));//tag.class
		WebElement select16= driver.findElement(By.cssSelector("section.clearfix"));//tag.class
		
		//tag[attribute type=attribute value]
		WebElement select111 = driver.findElement(By.cssSelector("input[placeholder=Message]"));
		WebElement select112 = driver.findElement(By.cssSelector("label[for=inputEmail4]"));
		//WebElement select113 = driver.findElement(By.cssSelector("img[alt=logo]"));
		WebElement select114 = driver.findElement(By.cssSelector("button[data-toggle=collapse]"));
		
		
		//tag.class[attributtype=attributvalue]
		WebElement select5 = driver.findElement(By.cssSelector("input.form-control[placeholder=Message]"));
		WebElement select6 = driver.findElement(By.cssSelector("button.navbar-toggler[type=button]"));
		WebElement select7 = driver.findElement(By.cssSelector("button.navbar-toggler[data-toggle=collapse]"));
		WebElement select8 = driver.findElement(By.cssSelector("input.form-control[id=value-b]"));
		WebElement select9 = driver.findElement(By.cssSelector("input.form-control[id=value-a]"));
		
	}
	public void Xpath() {
		WebElement xpath1=driver.findElement(By.xpath("//input[@placeholder='Message']"));		
		WebElement xpath2=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement xpath3=driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement xpath4=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		WebElement xpath5=driver.findElement(By.xpath("//button[@id='normal-btn-success']"));
		//WebElement xpath6=driver.findElement(By.xpath("//div[@id='todrag']"));
		WebElement xpath7=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		//absolute xpath
		WebElement absoluteXpath = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button"));
		
		//Contains
		WebElement dynamic1=driver.findElement(By.xpath("//div[contains(@id,'-one')]"));
		WebElement dynamic2=driver.findElement(By.xpath("//input[contains(@id,'-a')]"));
		WebElement dynamic3=driver.findElement(By.xpath("//button[contains(@id,'-two')]"));
		WebElement dynamic4=driver.findElement(By.xpath("//button[contains(@id,'download')]"));
		WebElement dynamic5=driver.findElement(By.xpath("//button[contains(@id,'l-btn-success')]"));
		//WebElement dynamic6=driver.findElement(By.xpath("//div[contains(@id,'drag')]"));
		WebElement dynamic7=driver.findElement(By.xpath("//div[contains(@id,'mydrop')]"));
		
		//text
		//tag[text()='TEXT']
		WebElement dynamic01=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement dynamic02=driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement dynamic03=driver.findElement(By.xpath("//button[text()='Single Input Field']"));
		WebElement dynamic04=driver.findElement(By.xpath("//button[text()='Your Message :']"));
		WebElement dynamic05=driver.findElement(By.xpath("//button[text()='Bootstrap Alert']"));
		WebElement dynamic06=driver.findElement(By.xpath("//button[text()='Window Popup']"));
		WebElement dynamic07=driver.findElement(By.xpath("//button[text()='Autoclosable success']"));
		
		
		//tagname[@attribute='value']//child::tagname[@attribute='value']
		WebElement dynamic11= driver.findElement(By.xpath("//button[@class='navbar-toggler']//child::span"));
		WebElement dynamic12= driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//child::ul"));
		WebElement dynamic13= driver.findElement(By.xpath("//div[@class='card-body']//child::button"));
		WebElement dynamic14= driver.findElement(By.xpath("//div[@data-provide='datepicker']//child::input"));
				//div[@class='card-body']//child:: form
				//div[@class='form-group']//child:: label
		
		
		WebElement dynamic21=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
		WebElement dynamic22=driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
		//a[@href='simple-form-demo.php']//parent::li
		//button[@id='downloadButton']//parent::div
		
		//following
		WebElement dynamic31=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		//button[@id='button-two']//following::div[@id='message-two
		//div[@class='form-group']//following::input[@id='value-b']
				
		//index value
		WebElement indexvalue=driver.findElement(By.xpath("(//form[@method='POST'])[1]"));
				
				
	}

}
