package CucumberCasestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;


public class OrderDeclined {
	WebDriver driver;
	
@Given("user login to application")
public void user_login_to_application() {
	 System.setProperty("webdriver.chrome.driver","C:\\Googledriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	    driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Headphone");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}

@Given("user order product without adding into cart")
public void user_order_product_without_adding_into_cart() {
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	driver.close();
}

}
