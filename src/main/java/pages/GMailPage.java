package pages;

import static core.Locators.get;
import static core.WebDriverContainer.findElement;
import static core.WebDriverContainer.findElements;
import static core.WebDriverContainer.getDriver;
import static org.testng.AssertJUnit.assertEquals;

import core.PageBase;
import org.openqa.selenium.By;


public class GMailPage extends PageBase {
    private static By emailLinks = get("GMailPage.emailLinks");

    private static final String TITLE = "Gmail title";

    public static void assertNumberOfEmails(int number){
        assertEquals(findElements(emailLinks).size(), number);
    }

    public static void shouldAppear(){
        shouldAppear(TITLE);
    }

}
