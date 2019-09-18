package windowhandle;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91770\\eclipse-workspace\\windowhandle\\drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://google.com/");
		driver.navigate().to("https://amazon.in/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Users//91770//eclipse-workspace//windowhandle//src//windowhandle//amazon.png"));
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		//driver.navigate().back();

	}

}
