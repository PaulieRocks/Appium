import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class androidUiAutomator extends basics {

    public androidUiAutomator() throws MalformedURLException {
    }

    public static void main(String[] args) throws MalformedURLException {

        androidUiAutomator tester=new androidUiAutomator();
        tester.execution();

    }

    public void execution() throws MalformedURLException {

        driver=super.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        super.navigatorStep();
        driver.findElementByXPath("//android.widget.EditText").sendKeys("hello");
        driver.findElementByAndroidUIAutomator("text(\"OK\")").click();


    }
}
