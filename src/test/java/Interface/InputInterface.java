package Interface;

public interface InputInterface extends BaseInterface {
    void sendKeys(String text);
    void sendKeysByJavaScript(String text);
    void sendKeysByAction(String text);
    void click();
}
