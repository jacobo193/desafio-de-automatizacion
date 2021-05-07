package co.sofka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myAccount {

    private WebDriver driver;
    private By account = By.className("page-heading");

    public myAccount(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(account).getText();
    }
}
