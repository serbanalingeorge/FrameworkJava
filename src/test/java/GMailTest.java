import com.sun.org.glassfish.gmbal.GmbalException;
import core.TestBase;
import org.junit.jupiter.api.Test;
import pages.GMailPage;
import pages.GoogleHomePage;
import pages.LoginPage;

public class GMailTest extends TestBase {

    @Test
    public void loginTest(){
        GoogleHomePage.clickSingInButton();
        LoginPage.shouldAppear();
        LoginPage.login();
        GoogleHomePage.shouldAppear();
        GoogleHomePage.goToGmail();
        GMailPage.shouldAppear();
        GMailPage.assertNumberOfEmails(5);
    }
}
