package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("http://leaftaps.com/opentaps/");
		chrome.findElement(By.id("username")).sendKeys("demosalesManager");
		chrome.findElement(By.id("password")).sendKeys("crmsfa");
		chrome.findElement(By.className("decorativeSubmit")).click();
		chrome.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		chrome.findElement(By.xpath("//a[text()='Leads']")).click();
		chrome.findElement(By.xpath("//a[text()='Find Leads']")).click();
		chrome.findElement(By.xpath("//div[@id='findLeads']//input[@name='firstName']")).sendKeys("FN2");
		chrome.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		chrome.findElement(By.xpath("//a[text()='FN2']")).click();
		Thread.sleep(3000);
		System.out.println(chrome.getTitle());
		chrome.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(2000);
		chrome.findElement(By.xpath("//a[text()='Find Leads']")).click();
		chrome.findElement(By.xpath("//div[@id='findLeads']//input[@name='firstName']")).sendKeys("FN2");
		chrome.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);		
		String res = chrome.findElement(By.xpath("//span[text()='Lead List']/parent::div/parent::div/parent::div/parent::div/following-sibling::div/div[1]/div/div/div[2]/div/table/following-sibling::div")).getText();
		System.out.println(res);
		chrome.close();
		
		
		
		
		
	}

}
