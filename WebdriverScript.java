package task15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverScript {
	public static void main(String[] args) throws InterruptedException {
		//Cerating object to Webdriver interface and ChromeDriver Class
		WebDriver d = new ChromeDriver();
		
		// launch the browser
		d.get("https://www.google.co.in/");
		
		//Page will be idle for 2 seconds
		Thread.sleep(2000);
		
		// Close the browser
		d.quit();
	}
	

}
