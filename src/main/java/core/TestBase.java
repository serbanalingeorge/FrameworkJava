package core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import static core.WebDriverContainer.*;

public class TestBase {
    protected WebDriver driver;

    @BeforeTest
    public void setup(){
        setDriver(WebDriverContainer.Driver.Chrome);

        open("https://www.google.by");
    }

    @AfterTest
    public void teardown(){
        quit();
    }

}
