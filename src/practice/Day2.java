package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Day2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("driver.webdriver.chrome", "C:\\Users\\gorak\\OneDrive\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.myntra.com/");
//		
//		WebElement mens=driver.findElement(By.xpath("//a[@href='/shop/men'][1]"));
//		WebElement tshirt=driver.findElement(By.xpath("//a[@href='/men-tshirts']"));
//		Actions ac=new Actions(driver);
//		ac.moveToElement(mens).perform();
//		tshirt.click();
//		driver.findElement(By.xpath("//span[text()='Recommended']")).click();
//		WebElement pop=driver.findElement(By.xpath("//label[text()='Popularity']"));
//		ac.moveToElement(pop).perform();
//		pop.click();
//		
//		
//		
//		Thread.sleep(5000);
//		driver.switchTo().alert().dismiss();
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,600)");
//		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File source=ts.getScreenshotAs(OutputType.FILE);
//		File dest =new File("C:\\Users\\gorak\\OneDrive\\Desktop\\selenium screenshot");
//		FileHandler.copy(source, dest);
		
		
		
	}

}
