package suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Cria e encerra uma instancia do chrome (seguindo o padrao SingleTown)
public class Web {

    private static WebDriver driver;

    private Web() {}

    public static WebDriver getInstanceChromeDriver() {
        if (driver== null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\geani\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void closeChromeDriver(){
        if (driver != null){
            driver.quit();
        }
        driver = null;
    }


}
