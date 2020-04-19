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

public class Swipe extends MainPage {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();

		// If there's a $ sign including tagName, use * sign to consider all tagNames
		driver.findElementByXPath("//*[@content-desc = '9']").click();

		TouchAction t = new TouchAction(driver);
		// Long Press, on Element, 2 sec, move to another element and you release
		WebElement descClockFifteen = driver.findElementByXPath("//*[@content-desc = '15']");
		WebElement descClockFourtyFive = driver.findElementByXPath("//*[@content-desc = '45']");
		t.longPress(longPressOptions().withElement(element(descClockFifteen)).withDuration(ofSeconds(2)))
				.moveTo(element(descClockFourtyFive)).release().perform();
	}

}
