package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected final AndroidDriver driver;

    public BasePage(AndroidDriver driver){
        this.driver = driver;
    }

    public void quit() {
        if (this.driver != null) {
            driver.quit();
        }
    }

}
