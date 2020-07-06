import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

    static Properties properties =  new Properties();

    public static void main(String args[]){
        readPropertiesFile();
        writePropertiesFile();
    }

    public static void readPropertiesFile(){
        try {
            InputStream inputStream = new FileInputStream("/Users/pallavi/Documents/personal/udemy/SeleniumWebDriver/src/test/java/config.properties");
            properties.load(inputStream);
            SeleniumTest.browser = properties.getProperty("browser");
            System.out.println(SeleniumTest.browser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writePropertiesFile(){
        try {
            OutputStream outputStream = new FileOutputStream("/Users/pallavi/Documents/personal/udemy/SeleniumWebDriver/src/main/java/config.properties");
           properties.setProperty("browser","Firefox");
           properties.store(outputStream,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
