package pages.AnthemHomePage.Containers;

import WebDriverExt.Driver;
import WebElementExt.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AnthemLoginPage.Login;
import utilities.Constants;
import utilities.Factories.PageFactory;

/**
 * Created by Dall on 22/6/2017.
 */
public class MenuPane {
    final private Elements elements;

    public MenuPane() {
        elements = new Elements();
        PageFactory.initElements(Driver.getDriver(), this.elements);
    }

    public class Elements {

        @FindBy(id="null-topmenu-1439339362269")
        public WebElement loginButton;

    }

    public Login login() {
        elements.loginButton.waitForIsDisplayed().click();
        elements.loginButton.waitUntilStale();
        return new Login();
    }
}
