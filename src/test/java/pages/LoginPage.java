package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){

        this.driver=driver;
    }
    public WebElement getEmailTextField(){
        return driver.findElement(By.id("email_create"));
    }
    public WebElement getButtonSubmit(){

        return driver.findElement(By.id("SubmitCreate"));
    }

    public WebElement getNameTextField(){
        return driver.findElement(By.id("customer_firstname"));
    }

    public WebElement getLastNameTextField(){
        return driver.findElement(By.id("customer_lastname"));

    }

    public WebElement getPasswordTextField(){
        return driver.findElement(By.id("passwd"));
    }

    public WebElement getAdressTextField(){
        return driver.findElement(By.id("address1"));
    }

    public WebElement getCityTextField(){
        return driver.findElement(By.id("city"));
    }

    public WebElement getCepTextField(){
        return driver.findElement(By.id("postcode"));
    }


    public WebElement getCelTextField(){
        return driver.findElement(By.id("phone_mobile"));
    }

    public WebElement getAliasTextField(){
        return driver.findElement(By.id("alias"));
    }

    public WebElement getStateSelectField(){
        return driver.findElement(By.id("id_state"));
    }


    public WebElement getRegisterButton(){
        return driver.findElement(By.id("submitAccount"));
    }


}
