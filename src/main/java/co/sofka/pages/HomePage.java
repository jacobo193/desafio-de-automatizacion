package co.sofka.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){this.driver= driver;}



    public loginPage clickLogin() {
        clickLink("Sign in");
        return new loginPage(driver);

    }

    public search clicksearh(){
        driver.findElement(By.id("search_query_top")).click();
        return new search(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}

