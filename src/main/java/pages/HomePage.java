package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    // Exemplo de localizadores de elementos na Home
    private final By sendSmsButton = By.id("com.stradalog:id/send_sms_button");
    private final By cadastreseButton = By.id("");

    public void clickSendSmsButton() {
        driver.findElement(sendSmsButton).click();
    }

    public CadastroPage clickCadastreSe() {
        driver.findElement(cadastreseButton).click();

        return new CadastroPage(this.driver);
    }

}
