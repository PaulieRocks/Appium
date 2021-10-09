package realAndroid;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

public class dragAndDrop extends base{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = launcher();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
        TouchAction action = new TouchAction(driver);
        WebElement origin =         driver.findElementsByClassName("android.view.View").get(0);
        WebElement destination1 =         driver.findElementsByClassName("android.view.View").get(2);

        TouchAction press = action.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(origin)).withDuration(Duration.ofSeconds(2))).moveTo(ElementOption.element(destination1)).release().perform();





    }
}
