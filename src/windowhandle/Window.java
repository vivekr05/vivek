package windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91770\\eclipse-workspace\\windowhandle\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginsubmit")).click();
		String parentWindowId = driver.getWindowHandle();
		System.out.println("ParentWindowid: "+ parentWindowId);
		driver.findElement(By.linkText("Continue to NetBanking")).click();
		Set<String>allWindowId = driver.getWindowHandles();
		for (String x: allWindowId) {
			if (!parentWindowId.equals(x)) {
				System.out.println("Child window id"+ x);
				driver.switchTo().window(x);
				Thread.sleep(3000);
			}
		}
		
		
		
		
	}

}
