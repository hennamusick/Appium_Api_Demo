package driver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HybridBasics extends HybrisMain{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("real");
		//AndroidDriver<AndroidElement> driver = capabilities("Android Real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// xpath, id, xpath

		/*
		 * xpath Syntax //tagname[@attribute='Value']
		 * 
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello Appium");
		driver.findElementsByClassName("android.widget.Button").get(1).click();

	}

}
