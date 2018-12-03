package pages;

import static core.Locators.get;
import static core.WebDriverContainer.findElement;
import core.PageBase;
import org.openqa.selenium.By;


public class LoginPage extends PageBase {

    private static By emailInput = get("LoginPage.emailInput");
    private static By nextButton = get("LoginPage.nextButton");
    private static By passwordInput = get("LoginPage.passwordInput");
    private static By singInButton = get("LoginPage.singInButton");

    private static String email = "serbangeorge.m@gmail.com";
    private static String password = "smaG210290";

    private static final String TITLE = "LoginPage title";

    public static void login(){
        findElement(emailInput).sendKeys(email);
        findElement(nextButton).click();
        findElement(passwordInput).sendKeys(password);
        findElement(singInButton).click();
    }

    public static void shouldAppear(){
        shouldAppear(TITLE);
    }
}
