package co.sofka.test;
import co.sofka.pages.HomePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class baseTest {

    private WebDriver driver;
    protected HomePage homePage;


    @BeforeAll
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.get("https://the-internet.herokuapp.com");
        goHome();



    }
    @BeforeEach
    public void goHome(){
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

    }

    @AfterAll
    public void TearDown(){
        driver.quit();

    }





}
