package driver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTests extends MainPage{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//UIAutomator Texts
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Validate Clickable
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size()); 
		//System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size()); 
	}

}
