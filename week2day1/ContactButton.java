package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactButton {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("http://leaftaps.com/opentaps/");
		
		chrome.findElement(By.id("username")).sendKeys("demosalesManager");
		
		chrome.findElement(By.id("password")).sendKeys("crmsfa");
		chrome.findElement(By.className("decorativeSubmit")).click();
		chrome.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		chrome.findElement(By.xpath("//a[text()='Contacts']")).click();
		chrome.findElement(By.xpath("//a[text()='Create Contact']")).click();
		chrome.findElement(By.id("firstNameField")).sendKeys("CFN2");
		chrome.findElement(By.id("lastNameField")).sendKeys("CLN2");
		chrome.findElement(By.xpath("//input[@value='Create Contact']")).click();
		Thread.sleep(6000);
		String firstName=chrome.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(firstName);
		System.out.println(chrome.getTitle());
		chrome.close();
	}

}
