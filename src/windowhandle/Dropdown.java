package windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91770\\eclipse-workspace\\windowhandle\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.selected.com/");
		driver.manage().window().maximize();
		Select select = new Select(driver.findElement(By.id("country-selector")));
		select.selectByVisibleText("France");
		
		
		
		
	
		}

}
