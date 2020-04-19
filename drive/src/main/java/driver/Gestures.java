package driver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends MainPage {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

		// Tap (Touch Actions)
		// Expandable Lists
		TouchAction t = new TouchAction(driver);
		WebElement expList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expList))).perform();

		// t.tap(tapOptions().withElement(element(expList)).withPosition(positionOption));
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement tLongPress = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");

		t.longPress(longPressOptions().withElement(element(tLongPress)).withDuration(ofSeconds(2))).release().perform();
		System.out.println(driver.findElementById("android:id/title").isDisplayed());

	}
}