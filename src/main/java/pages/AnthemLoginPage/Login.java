package pages.AnthemLoginPage;


import WebDriverExt.Driver;
import WebElementExt.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.AbstractBasePage;
import utilities.Factories.PageFactory;

/**
 * Created by Dall on 22/6/2017.
 */
public class Login extends AbstractBasePage {
    private static Login loginPage;
    private Elements elements;

    public Login() {
        this.elements = new Elements();
        PageFactory.initElements(Driver.getDriver(), this.elements);
    }

    public static Login get() {
        if(loginPage == null) {
            loginPage = new Login();
        }
        return loginPage;
    }

    @Override
    public String getUrl() {
        return "https://www.anthem.com/login/";
    }

    public class Elements {

        @FindBy(id = "txtUsername")
        public WebElement usernameTextbox;

    }

    public void EnterUserName(String name) {
        elements.usernameTextbox.waitForIsDisplayed().sendKeys(name);
    }

}
