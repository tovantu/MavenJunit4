package PageObject;

import Interface.*;
import TestSupport.WebElementCustom;
import org.openqa.selenium.By;

public class HomePage {

    public ClickInterface registerLink(){
        return new WebElementCustom(By.xpath("//a[contains(@class, 'login-step')]"));
    }
}
