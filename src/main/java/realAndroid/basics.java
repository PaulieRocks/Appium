package realAndroid;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class basics extends base{

    public static void main(String[] args) throws MalformedURLException {
        basics object= new basics();
        AndroidDriver<AndroidElement> driver = basics.launcher();


    }
}
