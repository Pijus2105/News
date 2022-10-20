package news;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newsclss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://www.newswire.com/newsroom");
		 
//		// driver.findElement(By.xpath("//h3[contains(text(),'U.S. Polo Assn. Welcomes the XII Federation of Int')]")).click();
		  
		  
		
		 driver.findElement(By.xpath("//div[@class='nw-subnavigation-wrapper']//li[6]")).click();
		 driver.findElement(By.xpath("//a[normalize-space()='Books']")).click();
		 driver.findElement(By.xpath("//img[@alt=\"Author Robert DeVoto's New Book 'The Adventures of Billy Box' is a Riveting Tale Centered Around Billy Box and His Friends as They Prepare for the Upcoming BMX Bike Race\"]")).click();
	     
		
		 WebElement el =  driver.findElement(By.xpath("//div[@class='smaller']"));		
	System.out.println(el.getText());
		
		
		 driver.findElement(By.xpath("//a[@class='nw-navigation__item-text'][normalize-space()='Newsroom']")).click();
		 
		 Set<String> hand = driver.getWindowHandles();
		 Iterator<String> it = hand.iterator();
		 String parentWindowId = it.next();
		 String childWindowId = it.next();
		 
		 driver.switchTo().window(childWindowId);
		
	driver.findElement(By.xpath("//body/section[@class='home-latest-news latest-news']/div[@class='wrapper']/div[@id='ln-container']/div[1]")).click();
	
	driver.findElement(By.xpath("//a[normalize-space()='Contact Information']")).click();		 
	 WebElement fl =  driver.findElement(By.xpath("//div[@class='smaller']"));		
	System.out.println(fl.getText());
	
	
	 driver.findElement(By.xpath("//a[@class='nw-navigation__item-text'][normalize-space()='Newsroom']")).click();


	}

}
