package task15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//launch browser
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		//verify the page
		
		System.out.println("Browse landed in correct page");
		//locate the element
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium web driver");
		Thread.sleep(5000);
		driver.findElement(By.className("gNO89b")).click();
		Thread.sleep(5000);
		//close the page
		driver.quit();
		
		
		
		
		
	}
	

}
