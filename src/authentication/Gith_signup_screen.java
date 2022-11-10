package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gith_signup_screen {

	public static void main(String[] args) throws InterruptedException {
		String testEmail="tasneem654@gmail.com";
		String testPassword="77690554";
		
		System.setProperty("webdriver.chrome.driver", "C:\\my new drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys(testEmail);
		driver.findElement(By.id("pass")).sendKeys(testPassword);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
		driver.findElement(By.xpath("//*[@id=\"initiate_interstitial\"]/div[3]/div/div[1]/button")).click();
	}
}