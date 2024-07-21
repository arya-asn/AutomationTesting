package DemoWorks;

public class BrowserCommands extends Base{
	
	public void browserCommand() {
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

	public static void main(String[] args) {
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.browserCommand();

	}

}
