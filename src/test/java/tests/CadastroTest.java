package tests;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CadastroPage;
import pages.HomePage;
import utils.DriverFactory;

public class CadastroTest {

    private CadastroPage cadastroPage;
    private HomePage homePage;

    @Test
    public void testCadastreSeEnvieSMS() {

        this.homePage = new HomePage(DriverFactory.getDriver());

        // Clicar no botão cadastre-se aqui
        this.cadastroPage = homePage.clickCadastreSe();

        //aceitar politica de dados
        cadastroPage.cienteButton();

        // Verifica se o login foi bem-sucedido
        cadastroPage.preencherCPF("08318856457");
        cadastroPage.continuarButton();

        // preencher numero do celular
        cadastroPage.preencherCelular("83988507206");
        cadastroPage.continuarButton();

        //Validar que estou na pagina de envio de SMS
        Assertions.assertTrue(cadastroPage.isEnvioSMSok());

        this.homePage.quit();
    }

}
