package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("driver.webdriver.chromedriver", "C:\\Users\\gorak\\OneDrive\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Saurabh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Yadav");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("kerakat jaunpur");
		
	}

}
