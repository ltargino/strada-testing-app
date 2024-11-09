package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroPage extends BasePage{

    private final By cienteButton = By.id("");
    private final By continuarButton = By.id("");

    private final By cpfInput = By.id("");
    private final By celularInput = By.id("");

    private final By smsLabel = By.id("");
    private final String smsLabelText = "";

    public CadastroPage(AndroidDriver driver){
        super(driver);
    }

    public boolean isLoginSuccessful() {
        try {
            // Espera pela presença do elemento após login
            new WebDriverWait(this.driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("com.stradalog:id/home_screen")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void cienteButton() {
        driver.findElement(cienteButton).click();
    }

    public void preencherCPF(String cpf) {
        driver.findElement(cpfInput).sendKeys(cpf);
    }

    public void continuarButton() {
        driver.findElement(continuarButton).click();
    }

    public void preencherCelular(String number) {
        driver.findElement(celularInput).sendKeys(number);
    }

    public boolean isEnvioSMSok() {
        return smsLabelText.equals(this.driver.findElement(smsLabel).getText());
    }
}