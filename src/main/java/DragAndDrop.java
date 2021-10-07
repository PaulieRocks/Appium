import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragAndDrop extends base{

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver=capabilities();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
        TouchAction action= new TouchAction(driver);
        driver.findElementsByClassName("android.view.View").get(0);
        WebElement origin =         driver.findElementsByClassName("android.view.View").get(0);
        WebElement destination =         driver.findElementsByClassName("android.view.View").get(2);

        action.longPress(LongPressOptions.longPressOptions().withElement(element(origin))).moveTo(element(destination)).release().perform();



    }
}
