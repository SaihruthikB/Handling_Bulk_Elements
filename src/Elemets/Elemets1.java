package Elemets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elemets1 {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:/Users/sai.hruthik/Desktop/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sai.hruthik/Desktop/hruthik1.html");
		List<WebElement> allcbs=driver.findElements(By.xpath("//input[@type='Check box']"));
		for(int i=0;i<=allcbs.size()-1;i++)
		{
			allcbs.get(i).click();
		}
		
			
}
}