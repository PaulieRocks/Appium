import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public class basics extends base{

    public AndroidDriver <AndroidElement> driver =capabilities();

    public basics() throws MalformedURLException {
    }


    public  void navigatorStep() throws MalformedURLException {

        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementByXPath("//android.widget.RelativeLayout[@package='io.appium.android.apis'][1]").click();
        driver.findElementByXPath(("//android.widget.TextView[@text='WiFi settings']")).click();

    }
}
