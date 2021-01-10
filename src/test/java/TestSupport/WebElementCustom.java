package TestSupport;


import Interface.BaseInterface;
import Interface.ClickInterface;
import Interface.InputInterface;
import Interface.TextInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCustom extends TestBase implements BaseInterface, ClickInterface, InputInterface, TextInterface {
    private int timeOut = 30;
    public By locator = null;
    WebElement element = null;
    public String xpath = null;

    public WebElementCustom(String xpath){
        this.xpath = xpath;
        element = findElementByXpath();
    }

    public WebElementCustom(By by){
        locator = by;
        element = findElement(locator, this.timeOut);
    }

    public WebElementCustom(By by, int timeOut){
        locator = by;
        element = findElement(locator, timeOut);
    }

    public WebElement findElement(By by, int timeOut){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),timeOut);
        return (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement findElementByXpath(){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),timeOut);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(this.xpath)));
    }

    public void waitForElementDisable(){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),timeOut);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitForElementClickAble(){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),timeOut);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitForVisibilityOfElement(){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForTextPresent(WebElement element, String text){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),timeOut);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public void click(){
        waitForVisibilityOfElement();
        waitForElementClickAble();
        element.click();
    }

    public void sendKeys(String text){
        waitForVisibilityOfElement();
        element.sendKeys(text);
    }
    public void sendKeysByJavaScript(String text){
        waitForVisibilityOfElement();
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript(String.format("arguments[0].value='%s';", text), element);
    }
    public void sendKeysByAction(String text){
        waitForVisibilityOfElement();
        Actions action = new Actions(DriverManager.getDriver());
        action.sendKeys(text).build().perform();
    }
    public String getText(String text){
        waitForVisibilityOfElement();
        waitForTextPresent(element, text);
        return element.getText().trim();
    }
    public boolean isDisplayed(){
        waitForVisibilityOfElement();
        return element.isDisplayed();
    }

}
