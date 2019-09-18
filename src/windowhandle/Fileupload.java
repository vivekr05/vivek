package windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91770\\eclipse-workspace\\windowhandle\\drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//*[@id=\"input_resumeParser\"]")).sendKeys("C:\\Users\\91770\\Downloads");
		

	}

}
