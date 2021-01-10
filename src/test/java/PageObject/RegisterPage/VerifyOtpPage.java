package PageObject.RegisterPage;

import Interface.*;
import TestSupport.WebElementCustom;
import org.openqa.selenium.By;

public class VerifyOtpPage {
    public InputInterface digitInput(){
        return new WebElementCustom(By.xpath("//div[contains(@class, 'digit-input__input--blinking')]"));
    }

    public void inputOTP(String[] arr){
        for(String item : arr){
            digitInput().sendKeysByAction(item);
        }
    }
}
