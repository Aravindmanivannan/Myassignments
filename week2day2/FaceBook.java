package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws Exception {

	WebDriverManager.chromedriver().setup();
	ChromeDriver chrome=new ChromeDriver();
	chrome.manage().window().maximize();
	chrome.get("https://en-gb.facebook.com/");
	chrome.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(5000);
	chrome.findElement(By.xpath("//input[@name='firstname']")).sendKeys("TestName");
	chrome.findElement(By.xpath("//input[@name='lastname']")).sendKeys("LastName");
	chrome.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123456789");
	chrome.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("AR120*");
	
	Select select=new Select(chrome.findElement(By.id("day")));
	select.selectByValue("1");
	Select month=new Select(chrome.findElement(By.name("birthday_month")));
	month.selectByVisibleText("Mar");
	Select year=new Select(chrome.findElement(By.name("birthday_year")));
	year.selectByIndex(20);
	
	chrome.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
	Thread.sleep(3000);
	chrome.close();
	

		
	}

}
