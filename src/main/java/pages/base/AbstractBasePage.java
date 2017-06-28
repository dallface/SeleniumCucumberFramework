package pages.base;

import WebDriverExt.Driver;
import WebElementExt.WebElement;


/**
 * Created by Dall on 21/6/2017.
 */
public abstract class AbstractBasePage implements BasePage {

    @Override
    public void GoTo() {
        Driver.getDriver().get(getUrl());
    }
}
