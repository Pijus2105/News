package news;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNews {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
		  driver.get("https://www.newswire.com/newsroom");
	  
	  System.out.println(driver.findElements(By.tagName("a")).size());
	  
	  WebElement links = driver.findElement(By.cssSelector("[class='row masonry']"));
		  System.out.println(links.findElements(By.tagName("a")).size());
		  
		  for(int i=0; i<links.findElements(By.tagName("a")).size(); i++) 
		  {
		  String num = Keys.chord(Keys.CONTROL, Keys.ENTER);
			  links.findElements(By.tagName("a")).get(i).sendKeys(num);
	  }
		  Set<String> hand = driver.getWindowHandles();
		  Iterator<String> it = hand.iterator();
		  
		    Set<String> allTab= driver.getWindowHandles();
	       //Iterator<String>it=allTab.iterator();
	  		  
		  //String parentWindowId = it.next();
		//  System.out.println("print" + parentWindowId);
		 // System.out.println("parent title" + driver.getTitle());
		  
		  String childWindowId = it.next();
		 // System.out.println("print" + childWindowId);
		  
		 // driver.switchTo().window(parentWindowId); 
		  
		  driver.switchTo().window(childWindowId);
		  
		  while(it.hasNext()) {
			 // int i=0;
				 driver.switchTo().window(it.next());
				 WebElement linksc = driver.findElement(By.linkText("Contact Information"));
				 linksc.click();
		  }
		  if(driver.findElements(By.cssSelector("div[class='smaller'] i[class='fa fa-envelope']")).size()!= 0) {
				 
			 }
			 
			 if(driver.findElements( By.cssSelector("div[class='smaller'] i[class='fa fa-envelope']") ).size()!= 0)
	       {    
	         Thread.sleep(5000);    
	        // System.out.println("Elemet is Present");
				 
				WebElement gr =  driver.findElement(By.cssSelector("div[class='smaller'] i[class='fa fa-envelope']"));
				gr.click();
				gr.getText();
			 
	         WebElement grab2=driver.findElement(By.cssSelector("div[class='smaller'] i[class='fa fa-envelope']"));
	         System.out.println(grab2.getText());
	       }else {
	           // i++;
	      	// int Not_Element =  i++;
	      	 
	         //System.out.println("Element is not Present");
	        // System.out.println(Not_Element);
	      }
		  }


	}


