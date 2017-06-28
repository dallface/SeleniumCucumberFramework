package pages.AnthemHomePage;

import WebDriverExt.Driver;
import WebElementExt.WebElement;
import pages.base.AbstractBasePage;
import org.openqa.selenium.support.FindBy;
import pages.AnthemHomePage.Containers.MenuPane;
import utilities.Factories.PageFactory;

/**
 * Created by Dall on 21/6/2017.
 */
public class Anthem extends AbstractBasePage {
    private static Anthem anthemPage;
    private Elements elements;

    public Anthem() {
        this.elements = new Elements();
        PageFactory.initElements(Driver.getDriver(), this.elements);
    }

    public static Anthem get() {
        if(anthemPage == null) {
            anthemPage = new Anthem();
        }

        return anthemPage;
    }

    @Override
    public String getUrl() {
        return "https://www.anthem.com/";
    }

    public class Elements {

        @FindBy(css="#mbr-page-wrapper > div:nth-child(1) > div > div.ant-top-wrapper > div > div > div.col-md-4.col-xs-1.col-xxs-2 > div > a > span.ant-menu-label.hidden-xxs.hidden-xs.hidden-sm")
        public WebElement menuToggle;

    }

    public pages.AnthemHomePage.Containers.MenuPane MenuPane = new MenuPane();

    private boolean menuToggled = false;

    public void toggleMenu() {
        elements.menuToggle.waitForIsDisplayed().click();
        if(menuToggled) menuToggled = false;
        else menuToggled = true;
    }
}
