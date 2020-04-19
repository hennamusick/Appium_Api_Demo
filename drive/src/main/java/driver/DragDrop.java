package driver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragDrop extends MainPage {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();

		// Long Press(Source)/Move(destination)/Release
		TouchAction t = new TouchAction(driver);
		WebElement sourceCircle = driver.findElementsByClassName("android.view.View").get(0);
		WebElement destinationCircle = driver.findElementsByClassName("android.view.View").get(1);
		/*
		 * t.longPress(longPressOptions().withElement(element(sourceCircle))).moveTo(
		 * element(destinationCircle)).release() .perform();
		 */
		t.longPress(element(sourceCircle)).moveTo(element(destinationCircle)).release().perform();

	}

}
