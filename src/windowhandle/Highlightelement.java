package windowhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlightelement {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91770\\eclipse-workspace\\windowhandle\\drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("Rajbala20");
		driver.findElement(By.name("password")).sendKeys("Balaji0");
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		flash(loginBtn, driver);
		drawBorder(loginBtn,driver);
		clickelement(loginBtn, driver);
		driver.navigate().refresh();
		
	}
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i=0; i<1; i++) {
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
			
			
		}
	}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
		}
		
		}
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}
	public static void clickelement(WebElement element, WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click;", driver);
		
	}

}
