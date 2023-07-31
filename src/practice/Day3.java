package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("driver.webdriver.chrome", "C:\\Users\\gorak\\OneDrive\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		WebElement html=driver.findElement(By.xpath("//a[@href='/html/tryit.asp?filename=tryhtml_default_default']"));
		html.click();
		WebElement css=driver.findElement(By.xpath("//a[@href='/css/tryit.asp?filename=trycss_default']"));
		css.click();
		Set<String> s=driver.getWindowHandles();
		for(String ele:s) {
			if(!ele.equals(driver.getWindowHandle())) {
				driver.switchTo().window(ele);
				driver.findElement(By.xpath("//a[@onclick='openMenu()']")).click();
			}
		}
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[@onclick='openMenu()']")).click();
//		System.out.println(driver.getWindowHandle());
		
		
	}

}
