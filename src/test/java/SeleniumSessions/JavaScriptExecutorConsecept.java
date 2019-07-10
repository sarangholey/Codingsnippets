package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConsecept
{
	public static void main(String[] args) throws InterruptedException 
	{
		//JavaScriptUtil obj = new JavaScriptUtil();
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com");
		
		// Printing Browser Information
		String getBrowserInfo = JavaScriptUtil.getBrowserInfo(driver);
		System.out.println(getBrowserInfo);
		
		// title of page by JavaScript
		String title = JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);
		Thread.sleep(2000);
		
		// refresh the page by JavaScript
		//JavaScriptUtil.refreshBrowserByJS(driver);
		Thread.sleep(2000);
		
		//  Click element by JavaScript
		WebElement loginViaSso = driver.findElement(By.xpath("//button[@id='ssoBtn']"));
		JavaScriptUtil.clickElementByJS(loginViaSso, driver);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement usernameBox = driver.findElement(By.xpath("//input[@id='username']"));
		JavaScriptUtil.drawBorder(usernameBox, driver);
		Thread.sleep(2000);
		
		WebElement rememberText = driver.findElement(By.xpath("//span[@class='private-checkbox__text']"));
		JavaScriptUtil.flash(rememberText, driver);
		Thread.sleep(2000);
		
		JavaScriptUtil.generateAlert(driver, "Alert Generated By Script");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		String innerPageText = JavaScriptUtil.getPageInnerText(driver);
		System.out.println(innerPageText);
		Thread.sleep(2000);
		
		driver.get("http://www.automationfraternity.com");
		JavaScriptUtil.scrollPageDown(driver);
		Thread.sleep(2000);
		
		WebElement untillElementAppears = driver.findElement(By.xpath("//*[@id=\"post-1308\"]/header/h2/a"));
		JavaScriptUtil.scrollIntoView(untillElementAppears, driver);
		
		
		
	}
	
}
