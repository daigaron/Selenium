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
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Day1 {
	//===========================29/05/23

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("driver.webdriver.chromedriver", "C:\\Users\\gorak\\OneDrive\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement fname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fname.sendKeys("Abhishek");
		WebElement lname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lname.sendKeys("Yadav");
		WebElement add=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		add.sendKeys("nalasopara");
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("abhish@gmail.com");
		WebElement mno=driver.findElement(By.xpath("//input[@type='tel']"));
		mno.sendKeys("8985653256");
		WebElement gen=driver.findElement(By.xpath("//input[@value='Male']"));
		gen.click();
		WebElement hob=driver.findElement(By.id("checkbox2"));
		hob.click();
		WebElement sbmit=driver.findElement(By.id("submitbtn"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", sbmit);
//		WebElement skill=driver.findElement(By.xpath("//select/option[@value='C++']"));
		WebElement skill=driver.findElement(By.id("Skills"));
//		skill.click();
		
		Select sc=new Select(skill);
		sc.selectByVisibleText("Android");
		WebElement countryclick=driver.findElement(By.xpath("//span[@role='combobox']"));
		countryclick.click();
		WebElement country=driver.findElement(By.xpath("//li[text()='India']"));
		country.click();
		
		Select year=new Select(driver.findElement(By.id("yearbox")));
		year.selectByValue("1997");
		Select month=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		month.selectByValue("August");
		Select day=new Select(driver.findElement(By.id("daybox")));
		day.selectByValue("13");
		
		driver.findElement(By.id("firstpassword")).sendKeys("Hello123");
		driver.findElement(By.id("secondpassword")).sendKeys("Hello123");
		Thread.sleep(5000);
		driver.findElement(By.id("submitbtn")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\gorak\\OneDrive\\Desktop\\selenium screenshot\\xyz.jpg");
		FileHandler.copy(source, dest);
		
		
		
	}

}
