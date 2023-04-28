package trip;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java .io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TripAdvisor {

	public static WebDriver driver;
	
	@Given("the user is on the landing page of the website")
	public void the_user_is_on_the_landing_page_of_the_website() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BrowserDriver\\chromedriver.exe");

		driver=new ChromeDriver();
		
		String url="https://www.tripadvisor.in/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}

	@When("the user clicks on the hotel option")
	public void the_user_clicks_on_the_hotel_option() throws InterruptedException {

    driver.findElement(By.xpath("//a[@href='/Hotels']")).click();
    
    Thread.sleep(3000);
    
        }
	
	

	@When("the user searches for Dubai in search box")
	public void the_user_searches_for_dubai_in_search_box() throws InterruptedException {
	 
		 driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("Dubai");
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//a[@href='/Hotels-g295424-Dubai_Emirate_of_Dubai-Hotels.html']")).click();
		    
		 
		
	}

	@Then("the user is redirected to the option page of the website")
	public void the_user_is_redirected_to_the_option_page_of_the_website() {
	   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Option page accessed!");
		
		
	}

	@Given("the user is on the option page of the website")
	public void the_user_is_on_the_option_page_of_the_website() throws InterruptedException {
	   
		System.out.println("\n\n on the option page of the website!");
		Thread.sleep(4000);
	}

	@When("the user chooses 26th april as check in date and 4th may as checkout date")
	public void the_user_chooses_26th_april_as_check_in_date_and_4th_may_as_checkout_date() throws InterruptedException {
	   
		driver.findElement(By.xpath("//button[@data-testid='nav_prev']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*/div[text()='26']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@data-testid='nav_next']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*/div[text()='4']")).click();
		
		Thread.sleep(4000);
		
	}

	@When("the user chooses {int} adults and {int} children room")
	public void the_user_chooses_adults_and_children_room(Integer int1, Integer int2) throws InterruptedException {
	    
	
		
		driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
		
		Thread.sleep(3000);
		
	}

	@Then("the user is shown all the hotels available in Dubai")
	public void the_user_is_shown_all_the_hotels_available_in_dubai() throws IOException, InterruptedException {
	  
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		
		Thread.sleep(3000);
		
		
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("/Users/TIRTHANKAR KHAUND/Pictures/Saved Pictures/tripadvisor.png"));
		
		Thread.sleep(4000);
		
		driver.close();

		
	}
	
	
}
