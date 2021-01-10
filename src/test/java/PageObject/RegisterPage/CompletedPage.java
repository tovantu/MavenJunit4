package PageObject.RegisterPage;

import Interface.*;
import TestSupport.WebElementCustom;
import org.openqa.selenium.By;

public class CompletedPage {
    public ClickInterface continueButton(){
        return new WebElementCustom(By.xpath("//button[@type='submit']"));
    }
}
