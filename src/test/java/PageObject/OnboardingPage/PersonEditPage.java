package PageObject.OnboardingPage;

import Interface.ClickInterface;
import Interface.InputInterface;
import TestSupport.WebElementCustom;
import org.openqa.selenium.By;

public class PersonEditPage {
    public ClickInterface dateOfBirth(){
        return new WebElementCustom(By.xpath("//div[@label='Date of Birth']//input"));
    }
    public ClickInterface nationality(){
        return new WebElementCustom(By.xpath("//div[@label='Nationality']//input"));
    }
    public ClickInterface nationalityOption(String country){
        return new WebElementCustom(By.xpath(String.format("//div[@class='q-item__label'][text()='%s']", country)));
    }
    public ClickInterface gender(){
        return new WebElementCustom(By.xpath("//div[@label='Gender']//input"));
    }
    public ClickInterface genderOption(String gender){
        return new WebElementCustom(By.xpath(String.format("//div[@class='q-item__label'][text()='%s']", gender)));
    }
    public ClickInterface productInterested(){
        return new WebElementCustom(By.xpath("//label//div[@placeholder ='Select your purpose of using Aspire']"));
    }
    public ClickInterface productInterestedOption(String product){
        return new WebElementCustom(By.xpath(String.format("//div[@class='q-item__label'][text()='%s']", product)));
    }

    public void selectNational(String country){
        nationality().click();
        nationalityOption(country).click();
    }
    public void selectGender(String gender){
        gender().click();
        genderOption(gender).click();
    }
    public void selectProductInterested(String[] arr){
        productInterested().click();
        for(String product : arr){
            productInterestedOption(product).click();
        }
    }
}
