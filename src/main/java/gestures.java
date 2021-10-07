import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import java.net.MalformedURLException;
import java.time.Duration;

public class gestures extends base{

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();
//        driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
        TouchAction t= new TouchAction(driver);
        WebElement expandList=driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");
        t.tap(tapOptions().withElement(element(expandList))).perform();
        WebElement longPressItem= driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        System.out.println(driver.findElementsByXPath("//android.widget.FrameLayout").size());

        t.longPress(LongPressOptions.longPressOptions().withElement(element(longPressItem)).withDuration(Duration.ofSeconds(2))).release().perform();
        System.out.println(driver.findElementsByXPath("//android.widget.TextView[@text='Sample menu']").size());
        System.out.println(driver.findElementsByXPath("//android.widget.FrameLayout").size());



    }
}
