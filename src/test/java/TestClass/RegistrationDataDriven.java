package TestClass;

import Helper.ReadCsvFile;
import TestSupport.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.*;

@RunWith(Parameterized.class)
public class RegistrationDataDriven extends TestBase {
    private String fullName;
    private String phoneCountry;

    @Parameterized.Parameters
    public static Collection<Object[]> getDataTest(){
        List<ArrayList<String>> objects = ReadCsvFile.readCsv("Book1");
        ArrayList<String> arrayName = objects.get(0);
        ArrayList<String> arrayPhoneCountry = objects.get(1);

        Object[][] obje = new Object[arrayName.size()][2];
        for(int i = 0; i < arrayName.size(); i ++){
            obje[i][0] = arrayName.get(i);
            obje[i][1] = arrayPhoneCountry.get(i);
        }
        return Arrays.asList(obje);
    }
    public RegistrationDataDriven(String fullName, String phoneCountry){
        this.fullName = fullName;
        this.phoneCountry = phoneCountry;
    }

    @Test
    public void checkWhenInputWrongPhoneNumber() {
        Page.homPage.registerLink().click();

        Page.registerPage.fullName().sendKeys(fullName);
        Page.registerPage.email().sendKeys(String.format("invalid@mail.com"));
        Page.registerPage.selectPhoneNumberOption(phoneCountry);
        Page.registerPage.phoneNumber().sendKeys("1234");
        Page.registerPage.role("Appointed director").click();
        String phoneError = "Phone number must be at least 11 characters.";
        Assert.assertEquals("Didn't see error above phone number",phoneError, Page.registerPage.phoneNumbberError().getText(phoneError));

    }
}
