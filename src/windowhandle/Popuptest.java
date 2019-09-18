package windowhandle;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuptest {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91770\\eclipse-workspace\\windowhandle\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://popuptest.com/");
		driver.findElement(By.linkText("Multi-PopUp Test")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator it = handler.iterator();
		String parentWindowid = it.next();
		System.out.println("Parent window id:"+ parentWindowid);
		String childWindowid = it.next();
		System.out.println("Child Window id:"+ childWindowid);
		driver.switchTo().window(childWindowid);
		System.out.println("Child Window pop title:" + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowid);
		System.out.println("Parent window pop title:"+ driver.getTitle());

	}

}
