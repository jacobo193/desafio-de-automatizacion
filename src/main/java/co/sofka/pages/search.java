package co.sofka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class search {

    private WebDriver driver;
    private By busqueda = By.id("search_query_top");
    private By SearchQueryButton = By.id("submit_search");

    public search(WebDriver driver){
        this.driver=driver;
    }

    public void setQuery (String query){
        driver.findElement(busqueda).sendKeys(query);
    }

    public SearchQuery buttonQuery (){
        driver.findElement(SearchQueryButton).click();

        return null;
    }

}
