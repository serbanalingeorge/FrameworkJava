package pages;

import static core.Locators.get;
import static core.WebDriverContainer.findElement;
import static helpers.Waiter.waitForJquery;

import core.PageBase;
import org.openqa.selenium.By;

public class GoogleHomePage extends PageBase {

    private static By singInButton = get("GoogleHomePage.singInButton");
    private static By gmailButton = get("GoogleHomePage.gmailButton");

    private static final String TITLE = "HomePage title";

    public static void clickSingInButton(){
       findElement(singInButton).click();
    }

    public static void goToGmail(){
       findElement(gmailButton).click();
       waitForJquery();
    }

    public static void shouldAppear(){
        shouldAppear(TITLE);
    }
}
