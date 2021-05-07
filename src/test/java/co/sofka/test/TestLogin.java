package co.sofka.test;

import co.sofka.pages.HomePage;
import co.sofka.pages.loginPage;
import co.sofka.pages.myAccount;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestLogin extends baseTest{
    @Test
    public void testSuccessfulLogin(){
        loginPage loginPage = homePage.clickLogin();
        loginPage.setEmail("Jacobo222@hotmail.com");
        loginPage.setPassword("david1.11");
        myAccount myAccount = loginPage.clickLoginButton();
        assertTrue(true, myAccount.getAlertText());

        }
    }


