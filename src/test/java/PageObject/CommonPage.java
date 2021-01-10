package PageObject;

import Interface.*;
import TestSupport.WebElementCustom;
import org.openqa.selenium.By;

public class CommonPage {
    public BaseInterface spinner(){
        return new WebElementCustom(By.xpath("//*[contains(@class, 'q-spinner')]"));
    }
    public ClickInterface buttonSubmit(){
        return  new WebElementCustom(By.xpath("//button[@type='submit']"));
    }
}
