package realAndroid;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.lang.Thread.sleep;

public class swipeDemo extends base {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = launcher();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        TouchAction action = new TouchAction(driver);
        WebElement start= driver.findElementByXPath("//*[@content-desc='3']");
        action.tap(TapOptions.tapOptions().withElement(element(start))).release().perform();
        Thread.sleep(2000);
        WebElement pin= driver.findElementByXPath("//*[@content-desc='15']");
        WebElement dest= driver.findElementByXPath("//*[@content-desc='45']");
        WebElement hop= driver.findElementByXPath("//*[@content-desc='0']");
        action.longPress(LongPressOptions.longPressOptions().withElement(element(pin))).moveTo(element(dest)).moveTo(element(hop)).release().perform();






    }
}
