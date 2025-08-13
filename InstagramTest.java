package instagramAutomation;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class InstagramTest  {
	AndroidDriver driver;
	@Test
	public void openInstagramTest() throws InterruptedException {
		Thread.sleep(5000);
		try {
			WebElement element = driver.findElementById("dummy_id");
	            if (element.isDisplayed()) {
	                System.out.println("Instagram opened successfully!");
	            }
	        } catch (Exception e) {
	            System.out.println("Failed to verify Instagram home screen: " + e.getMessage());
	        }
	    }
  @BeforeTest
  public void launchingcommands() throws MalformedURLException {
	  driver = getDriver();
	  System.out.println("Server connected");
	  }
 
  @AfterTest
  public void closing_commands() throws InterruptedException {
	  driver.quit();

}
  private AndroidDriver getDriver() throws MalformedURLException {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "realme Narzo 20");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("platformVersion", "11");
	  capabilities.setCapability("automationName", "UiAutomator2"); 
	  capabilities.setCapability("appPackage", "com.instagram.android");
	  capabilities.setCapability("appActivity", "com.instagram.android.activity.MainTabActivity");
      return new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities); 
}
}
