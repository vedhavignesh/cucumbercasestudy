package CucumberCasestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;


public class Login {
	WebDriver driver;
	
	@Given("user navigates to login page")
	public void user_navigates_to_login_page() {
		 System.setProperty("webdriver.chrome.driver","C:\\Googledriver\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@Given("user enters the username")
	public void user_enters_the_username() {
	   driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
	}

	@Given("user enters the password")
	public void user_enters_the_password() {
	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	}

	@Given("user clicks the login button")
	public void user_clicks_the_login_button() {
	  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Given("verify login")
	public void verify_login() {
	    String title=driver.getTitle();
	    Assert.assertEquals("Home", title);
	}


}
