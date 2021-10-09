package realAndroid;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class base {

    public static AndroidDriver<AndroidElement> launcher() throws MalformedURLException {
        File appDir = new File("src");
        File app = new File(appDir,"ApiDemos-debug.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        AndroidDriver<AndroidElement> driver;
        driver = new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;


         }
}
