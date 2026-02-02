
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the browser
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(4000);
		driver.get("https://www.netflix.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println((driver.getTitle()));
		// Language dropdown
		
		WebElement Language = driver.findElement(By.id(":R2kqlalalap6:"));
		Select dropdown = new Select(Language);
		System.out.println( dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("hi-IN");
		System.out.println(driver.getCurrentUrl());
		WebElement Language2 = driver.findElement(By.id(":R2kqlalalap6:"));
		Select dropdown2 = new Select(Language2);
		dropdown2.selectByValue("en-IN");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		// Enter Email address and click get started
		String Email ="sahityaravipati29@gmail.com";
		driver.findElement(By.xpath("//input[@data-uia='field-email']")).sendKeys(Email);
		driver.findElement(By.cssSelector("button[data-uia='nmhp-card-cta+hero_card']")).click();
		driver.get("https://www.netflix.com/");
		
		//Trending search
        
		driver.findElement(By.cssSelector("button[data-uia='top-10-element-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[data-uia='icon-button+icon-wrapper']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='default-ltr-iqcdef-cache-bwo6la']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='default-ltr-iqcdef-cache-bwo6la'][aria-label='Previous']")).click();
		Thread.sleep(2000);
		//List of Trending Now 
		List<WebElement> Trending = driver.findElements(By.xpath("//div[contains(@class,'default-ltr-iqcdef-cache-3xjlkv')]"));
		System.out.println("Top Trending Titles:");
		
		
		for( int i=0; i< Trending.size() ;i++)
		{
			System.out.println((i+1)+"." +Trending.get(i).getText());

		}
		
		//Frequently Asked Questions
		
		driver.findElement(By.xpath("//button[@data-uia='nmhp-faq-accordion+button-0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-uia='nmhp-faq-accordion+button-1']")).click();
        Thread.sleep(2000);
        
        /*sign in button with wrong password
		driver.findElement(By.cssSelector("a[data-uia='header-login-link']")).click();
		driver.findElement(By.name("password")).sendKeys("pumpki@1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@data-uia='alert-message-header']")).getAttribute("innerText"));
		//Forgot Password
		driver.findElement(By.xpath("//a[@data-uia='forgot-password-link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[data-uia='login-help-radio-text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[data-uia='login-help-radio-email']")).click();
		driver.findElement(By.name("email")).sendKeys(Email);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-uia='emailMeButton']")).click();*/
		
		//Login
		
        driver.findElement(By.cssSelector("a[data-uia='header-login-link']")).click();
		driver.findElement(By.name("password")).sendKeys("pumpkin@12");
		driver.findElement(By.name("rememberMe")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println((driver.getTitle()));
		
	
		
		driver.quit();
				
	}

}
