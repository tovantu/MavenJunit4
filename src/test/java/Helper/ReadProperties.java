package Helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

    private static ReadProperties instance = null;
    private Properties properties = new Properties();


    public static ReadProperties getInstance() {
        if (instance == null) {
            instance = new ReadProperties();
            instance.readConfig();
        }
        return instance;
    }
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
    private void readConfig() {
        String file = System.getProperty("user.dir") + "\\src\\test\\java\\DataTest\\Registration.properties";
        try (InputStream inputStream = new FileInputStream(file)) {
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
