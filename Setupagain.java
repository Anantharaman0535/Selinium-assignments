package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Setupagain {

	public static void main(String[] args) {
		//Setup
		WebDriverManager.chromedriver().setup();
		//Launch
		ChromeDriver Drive = new ChromeDriver();
		//Load the URL
		Drive.get("http://leaftaps.com/opentaps/control/main");
		//Maximize browser window
         Drive.manage().window().maximize();
         //Enter the username ctr+2,L
         
         WebElement eleUserName = Drive.findElement(By.id("username"));
         eleUserName.sendKeys("DemoSalesManager");
		
		WebElement passWord = Drive.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		
		Drive.findElement(By.className("decorativeSubmit")).click();
		Drive.findElement(By.id("label")).click();
		Drive.findElement(By.linkText("Leads")).click();
		Drive.findElement(By.linkText("Create Lead")).click();
		Drive.findElement(By.id("createLeadForm_companyName")).sendKeys("ADP.LTD");
		Drive.findElement(By.id("createLeadForm_firstName")).sendKeys("Anantharaman");
		Drive.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajaraman");
		Drive.findElement(By.className("smallSubmit")).click();
		
		
	}

}
