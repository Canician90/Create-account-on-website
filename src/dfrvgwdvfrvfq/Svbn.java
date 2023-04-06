package dfrvgwdvfrvfq;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Svbn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://gcreddy.com/project/create_account.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
			driver.findElement(By.name("gender")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("firstname")).sendKeys("abcd");
			Thread.sleep(1000);
			driver.findElement(By.name("lastname")).sendKeys("xyz");
			Thread.sleep(1000);
			driver.findElement(By.id("dob")).sendKeys("10/10/2000");
			Thread.sleep(1000);
			String email = "sriniram123"+ Math.random()+ "@gmail.com";
			System.out.println(email);
			driver.findElement(By.name("email_address")).sendKeys(email);
			Thread.sleep(1000);
		
			driver.findElement(By.cssSelector ("#bodyContent > form > div > div:nth-child(6) > table > tbody > tr:nth-child(1) > td.fieldValue > input[type=text]")).sendKeys("abcd 2 xyz");
			Thread.sleep(1000);
			driver.findElement(By.name("postcode")).sendKeys("500072");
			Thread.sleep(1000);
			driver.findElement(By.name("city")).sendKeys("Hyderabad");
			Thread.sleep(1000);
			driver.findElement(By.name("state")).sendKeys("Telangana");
			Thread.sleep(1000);
			
			Select dropDown = new Select (driver.findElement(By.name("country")));
			dropDown.selectByVisibleText("India");
		
			driver.findElement(By.name("telephone")).sendKeys("9876767676");
			Thread.sleep(1000);
			driver.findElement(By.name("password")).sendKeys("abcd321");
			Thread.sleep(1000);
			driver.findElement(By.name("confirmation")).sendKeys("abcd321");
			Thread.sleep(1000);

			driver.findElement(By.id("tdb4")).click();
			Thread.sleep(1000);

			driver.findElement(By.name("password")).sendKeys("abcd321");
			Thread.sleep(1000);
			driver.findElement(By.name("confirmation")).sendKeys("abcd321");
			
			Thread.sleep(1000);
			driver.findElement(By.id("tdb4")).click();
			Thread.sleep(1000);

			String confirmationMessage = driver.findElement(By.tagName("h1")).getText();

			if (confirmationMessage.equals("Your Account Has Been Created!")) {
			System.out.println("Pass");
			}
			else {
			System.out.println("Fail");
			}
			driver.close();
	
	}
}