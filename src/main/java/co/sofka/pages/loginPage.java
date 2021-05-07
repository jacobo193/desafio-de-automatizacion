package co.sofka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By passwordField = By.id("passwd");
    private By loginButton = By.cssSelector("#SubmitLogin > span");

    public loginPage(WebDriver driver){
        this.driver =driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public myAccount clickLoginButton(){
        driver.findElement(loginButton).click();
        return new myAccount(driver);
    }

}
