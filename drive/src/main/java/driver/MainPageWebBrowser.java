package driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class MainPageWebBrowser {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "R");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}
}
