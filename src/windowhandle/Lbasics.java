package windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lbasics {

	public static void main(String[] args) {
		 {
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\91770\\eclipse-workspace\\windowhandle\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fin.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fin.ebay.com%252F");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("bala");
				driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("rajendran");
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("balajirajendhiren20@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).sendKeys("Balaji@20");
				driver.findElement(By.id("ppaFormSbtBtn")).click();
			}
		

	}

}
