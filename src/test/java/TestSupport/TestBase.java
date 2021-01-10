package TestSupport;

import PageObject.PageBase;
import org.junit.*;

public class TestBase {
    public PageBase Page = null;
    public final String URL = "";



    @Before
    public void setUp(){
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().get(URL);
        Page = new PageBase();
    }

    @After
    public void cleanUp(){
        DriverManager.resetDriver();
    }


}
