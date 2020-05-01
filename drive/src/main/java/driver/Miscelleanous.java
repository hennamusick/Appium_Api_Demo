package driver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Miscelleanous extends MainPage {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getContext());

		// Views - Native, Hybrid, WebView
		// System.out.println(driver.getOrientation());
		// System.out.println(driver.getCapabilities());
		// driver.getKeyboard();

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		// driver.pressKey

	}

}
