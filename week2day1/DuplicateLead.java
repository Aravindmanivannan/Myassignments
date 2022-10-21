package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		
	ChromeDriver chrome=new ChromeDriver();
	chrome.manage().window().maximize();
	chrome.get("http://leaftaps.com/opentaps/");
	
	chrome.findElement(By.id("username")).sendKeys("demosalesManager");
	
	chrome.findElement(By.id("password")).sendKeys("crmsfa");
	chrome.findElement(By.className("decorativeSubmit")).click();
	chrome.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	chrome.findElement(By.xpath("//a[text()='Leads']")).click();
	chrome.findElement(By.xpath("//a[text()='Create Lead']")).click();
	chrome.findElement(By.id("createLeadForm_companyName")).sendKeys("Test2");
	chrome.findElement(By.id("createLeadForm_firstName")).sendKeys("FN2");
	chrome.findElement(By.id("createLeadForm_lastName")).sendKeys("LN2");
	chrome.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("FNL2");
	chrome.findElement(By.name("departmentName")).sendKeys("DN2");
	chrome.findElement(By.name("description")).sendKeys("Desct2");
	chrome.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test3@gmail.com");
	chrome.findElement(By.xpath("//input[@value='Create Lead']")).click();
	
    Thread.sleep(6000);
   
    System.out.println(chrome.getTitle());
    chrome.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	chrome.findElement(By.id("createLeadForm_companyName")).clear();
	chrome.findElement(By.id("createLeadForm_companyName")).sendKeys("Test3");
	chrome.findElement(By.id("createLeadForm_firstName")).clear();
	chrome.findElement(By.id("createLeadForm_firstName")).sendKeys("FN3");
    chrome.findElement(By.xpath("//input[@value='Create Lead']")).click();
	
    Thread.sleep(6000);
   
    System.out.println(chrome.getTitle());
	

    Thread.sleep(6000);



	chrome.close();
	
	}
}