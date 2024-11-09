package utils;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    public static AndroidDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "uiautomator2");
//        capabilities.setCapability("platformVersion", "4.50.1");
        capabilities.setCapability("appPackage", "net.nuvem.mobile.carguero");
        capabilities.setCapability("appActivity", "net.nuvem.mobile.carguero.StartActivity");

        try {
            return new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

}


