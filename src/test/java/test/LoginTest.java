package test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;

	@BeforeMethod
	public void startBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\remaj\\OneDrive\\Documents\\Spring 2020\\crm\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		// driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				driver.get("http://techfios.com/test/billing/?ng=admin/");
				
				

	}
	
	@Test(priority=1)
	public void validUserShouldBeAbleToLogin() throws InterruptedException {
		
		//Thread.sleep(3000);
		
	driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
	driver.findElement(By.xpath("//button[contains(text(), 'Sign')]")).click();
	waitforelement(driver, 10, By.xpath("//h2[contains(text(), 'Dashboard')]"));
	}

		/*Thread.sleep(3000);

		// click on customer button
		driver.findElement(By.xpath("//span[text()='Customers']")).click();

		Thread.sleep(3000);

		// click on Add customer button
		driver.findElement(By.xpath("//a[text()= 'Add Customer'] ")).click();
		
		Thread.sleep(3000);
		
		/* Library of Elements
		By FULL_NAME_INPUT_FIELD_LOCATOR = By.id("account");
		By COMPANY_NAME_INPUT_FIELD_LOCATOR = By.id("cid");
		By EMAIL_INPUT_FIELD_LOCATOR = By.id("email");
		By PHONE_INPUT_FIELD_LOCATOR = By.id("phone");
		By ADDRESS_INPUT_FIELD_LOCATOR = By.id("address");
		By CITY_INPUT_FIELD_LOCATOR = By.id("city");
		By STATE_REGION_INPUT_FIELD_LOCATOR = By.id("state");
		By ZIP_POSTAL_CODE_INPUT_FIELD_LOCATOR = By.id("zip");
		By COUNTRY_INPUT_FIELD_LOCATOR = By.id("select2-country-container");
		By TAGS_INPUT_FIELD_LOCATOR = By.xpath("//option[@value = 'usa']");
		By CURRENCY_INPUT_FIELD_LOCATOR = By.xpath("//select[@id ='currency']/option[@value = '1']");
		By GROUP_INPUT_FIELD_LOCATOR = By.xpath("//select[@id = 'group']");
		By DROP_DOWN_MENU_LOCATOR = By.xpath("//option[@value=2]");
		By PASSWORD_INPUT_FIELD_LOCATOR = By.id("password");
		By CONFIRM_PASSWORD_INPUT_FIELD_LOCATOR = By.id("cpassword");
		By WELCOME_EMAIL_TOGGLE_LOCATOR = By.xpath("//label[contains(text(), 'Yes')]");
		By SAVE_BUTTON_LOCATOR = By.xpath("//button[@id='submit']");
		
		//Select sel = new Select(Group);
		//sel.selectByIndex(2);
		
		Random rnd = new Random();
		int randomnumber = rnd.nextInt(100);

		String fullName = "James" + randomnumber;
		String CompanyName = "Techfios" + randomnumber;
		String Email = "techfios" + randomnumber+ "@gmail.com";
		String Phone = "4568732145";
		String Address = "7795 Burnet Rd" + randomnumber;
		String City= "Austin" + randomnumber;
		String State = "TX";
		String ZIP = "78757";
		String Password = "James" + randomnumber;
		String Confirm_Password = "James" + randomnumber;
		
		
		driver.findElement(FULL_NAME_INPUT_FIELD_LOCATOR).sendKeys(fullName);
		driver.findElement(COMPANY_NAME_INPUT_FIELD_LOCATOR).sendKeys(CompanyName);
		driver.findElement(EMAIL_INPUT_FIELD_LOCATOR).sendKeys(Email);
		driver.findElement(PHONE_INPUT_FIELD_LOCATOR).sendKeys(Phone);
		driver.findElement(ADDRESS_INPUT_FIELD_LOCATOR).sendKeys(Address);
		driver.findElement(CITY_INPUT_FIELD_LOCATOR).sendKeys(City);
		driver.findElement(STATE_REGION_INPUT_FIELD_LOCATOR).sendKeys(State);
		driver.findElement(ZIP_POSTAL_CODE_INPUT_FIELD_LOCATOR).sendKeys(ZIP);
		driver.findElement(TAGS_INPUT_FIELD_LOCATOR).click();
		Thread.sleep(3000);
		driver.findElement(CURRENCY_INPUT_FIELD_LOCATOR).click();
		Thread.sleep(3000);
		driver.findElement(GROUP_INPUT_FIELD_LOCATOR).click();
		driver.findElement(DROP_DOWN_MENU_LOCATOR).click();
		driver.findElement(PASSWORD_INPUT_FIELD_LOCATOR).sendKeys(Password);
		driver.findElement(CONFIRM_PASSWORD_INPUT_FIELD_LOCATOR).sendKeys(Confirm_Password);
		//driver.findElement(SAVE_BUTTON_LOCATOR).click();*/
		
	
	public void waitforelement(WebDriver driver, int timeInSeconds, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

}
