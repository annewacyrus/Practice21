package launchChrome;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest_Junit {
	static WebDriver driver;

	@AfterClass
	public static void afterTest() {
		System.out.println("AfterClass");
	}

	@BeforeClass
	public static void beforeTest() {
		System.out.println("BeforeClass");

	}

	@Before
	public void launchBrowser() {
		System.out.println("Before");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\wa_ng\\OneDrive\\Desktop\\SELENIUM\\Maven\\MavenSelenium\\driver\\chromedriver.exe");// initiate
																													// chrome
																													// driver
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");// the . represents the code
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");// different ways of presenting the
																					// code
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");// with a forward slash // //initiate
																					// chrome driver
		driver = new ChromeDriver();// WebDriver driver = new ChromeDriver();// this is a local webdriver
									// declaration, need to make it global
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=admin/");// navigating to our website
	}

	@Test
	public void logintest1() throws InterruptedException {
		System.out.println("test positive");
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
	}

	public void loginTest() {
		System.out.println("Test1");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");// inputting the username
		driver.findElement(By.id("password")).sendKeys("abc123");// input for password
		driver.findElement(By.name("login")).click();// click on sign in button,input for log in
	}
	@Test
	public void loginTest2() {
		System.out.println("Test neg");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");// inputting the username
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		driver.findElement(By.id("password")).sendKeys("abc123");// input for password
		driver.findElement(By.name("login1")).click();// click on sign in button,input for log in
	}
	public static void loginTestNegative() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");// inputting the username
		driver.findElement(By.id("password")).sendKeys("abc123");// input for password
		driver.findElement(By.name("login")).click();// click on sign in button,input for log in
	}

	@After
	public void tearDown() {
		System.out.println("After");
		driver.close();

	}

}
