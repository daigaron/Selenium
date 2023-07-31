package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("driver.webdriver.chrome", "C:\\Users\\gorak\\OneDrive\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("hello");
		//txt1.sendKeys("Hello frame 1");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("hello");
//		
	}

}
