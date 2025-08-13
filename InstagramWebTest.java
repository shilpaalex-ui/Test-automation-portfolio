package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class InstagramWebTest {
  WebDriver driver;
  @Test
  public void Login() throws InterruptedException{
	  String title=driver.getTitle();
	  System.out.println(title);
	  try {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  WebElement element=driver.findElement(By.xpath("//div[@class='html-div x14z9mp x1lziwak xexx8yu xyri2b x18d9i69 x1c1uobl x9f619 xjbqb8w x78zum5 x15mokao x1ga7v0g x16uus16 xbiv7yw xseo6mj xod5an3 x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']"));
		  if(element.isDisplayed()) {
		  System.out.println(element);
		  System.out.println("element displayed");
	  }
	  }
	 catch (Exception e) {
		  System.out.println("Failed to open Instagram "+e.getMessage());
	  }
	  //if (title.equals("Instagram")) {
         // System.out.println("Instagram opened successfully!");
      //} else {
          //System.out.println("Failed to open Instagram. Title: " + title);
     // }
	  
	  
}
@BeforeTest
  public void launching_Commands()throws MalformedURLException {
	  driver=new EdgeDriver();
	  driver.get("https://www.instagram.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void Closing_commands() throws InterruptedException{
	 driver.quit();
  }

}
