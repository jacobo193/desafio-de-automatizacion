package co.sofka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchQuery {
    WebDriver driver;
    private By type = By.className("lighter");

    public SearchQuery(WebDriver driver){
        this.driver = driver;
    }

    public String Query (){
        return driver.findElement(type).getText();
    }
}
