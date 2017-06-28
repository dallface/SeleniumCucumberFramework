package step_defs.base;

import WebDriverExt.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;


/**
 * Created by Dall on 22/6/2017.
 */
public class AbstractBaseSteps {

    @Before
    public void Setup() {
        Driver.createDriver();
    }

    @After
    public void TestCleanup() {
        if(Driver.getDriver() != null) {
            Driver.getDriver().quit();
        }
    }
}
