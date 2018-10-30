package eduProfileUpload;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	public void RunAutoIt() {
		
		try {
			String strFilePath="D:\\Java Project Files\\projectEdureka\\20171214_222912.jpg";
			String strPath="D:\\Java Project Files\\projectEdureka\\Attachment.exe";
			String strParameter= strPath + " " + strFilePath; 
			Runtime.getRuntime().exec(strParameter);
		} catch (Exception e) {
			System.out.println("Failed to upload profile image");
		}
	}
	
  @Test
  public void f() throws Exception {
	  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Log In"))));
	  driver.findElement(By.linkText("Log In")).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='inputName']"))).sendKeys("kraykol@gmail.com");
	  driver.findElement(By.xpath("//input[@id='pwd1']")).sendKeys("Tripti@01");
	  driver.findElement(By.xpath("//div[@class='forgotpasssec']//button[@type='submit']")).click();
	  driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/a/span")).click();
	  driver.findElement(By.xpath("//div//a[contains(text(),'My Profile')]")).click();
	  driver.findElement(By.xpath("//div//i[@class='icon-pr-edit']")).click();
	  Thread.sleep(6000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='collapseOne']/div/div/div[2]/a/i"))).click();
	  
	  driver.switchTo().activeElement(); 	  
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//div//input[@id='custom-input']")).click();
	  Thread.sleep(6000);
	  RunAutoIt();
	}
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Used Jar Files\\WebDriver\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://edureka.co/");
	  wait= new WebDriverWait(driver, 40);
  }

  @AfterTest
  public void afterTest() {
  }

}
