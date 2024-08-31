package task19;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class possible_locators {
	
	public static void main(String args[]) {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	

	driver.get("https://www.guvi.in/register");
    
    driver.manage().window().maximize();
 
	//content
	driver.findElement(By.xpath("//div[@class='signup-content-detail']"));
	driver.findElement(By.className("signup-content-detail"));
	driver.findElement(By.cssSelector(".signup-content-detail"));
	
		//Login
	driver.findElement(By.xpath("//a[@class='login']"));
	driver.findElement(By.className("login"));

	//Sign-up with Google
	
	driver.findElement(By.id("button-label"));
    driver.findElement(By.xpath("//div//span[@id='button-label']"));
    driver.findElement(By.className("L6cTce"));
    driver.findElement(By.xpath("//div//span[@class='L6cTce']"));
    driver.findElement(By.cssSelector(".L6cTce"));
    
    //tags
    driver.findElement(By.tagName("a"));
    driver.findElement(By.tagName("div"));
    driver.findElement(By.tagName("span"));
	
    //FullName
    driver.findElement(By.xpath("//div//input[@id='name']"));
    driver.findElement(By.id("name"));
    
    
    //This Name will appear on certificate
    
    driver.findElement(By.xpath("//div//small[@class='certificates']"));
    driver.findElement(By.className("certificates"));
    driver.findElement(By.cssSelector(".certificates"));
    
    //Email
    driver.findElement(By.xpath("//div//input[@type='email']"));
    driver.findElement(By.id("email"));
    
    //Password
    driver.findElement(By.id("password"));
    driver.findElement(By.xpath("//div//input[@id='password']"));
    
    //password toggle
    driver.findElement(By.id("togglePassword"));
    driver.findElement(By.xpath("//div//span[@id='togglePassword']"));
    
    //mobile number
    driver.findElement(By.id("mobileNumber"));
    driver.findElement(By.xpath("//div//input[@id='mobileNumber']"));
    
    
    //sign up
    driver.findElement(By.id("signup-btn"));
    driver.findElement(By.xpath("//div//a[@id='signup-btn']"));
    
    
    //loginURL
    driver.findElement(By.xpath("//div//a[@class='login']"));
    driver.findElement(By.className("login"));
    
    
	driver.close();
	
	}

}
