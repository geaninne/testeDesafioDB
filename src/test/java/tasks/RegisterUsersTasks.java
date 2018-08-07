package tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

/*Classe contem tarefas da atividade Registrar Usuario*/

public class RegisterUsersTasks {

    private LoginPage loginPage;
    WebDriver driver;
    WebDriverWait wait;
    public RegisterUsersTasks(WebDriver driver){


        this.loginPage = new LoginPage(driver);
        this.wait = new WebDriverWait(driver,10);

    }


    public void register(){
        fillEmail("testeDesafioDBSelenium6@gmail.com");
        submitEmail();
        fillFormPersonal("joana","silva","12345");
        fillFormAdress("rua 40","Austin","00000","55 999999999","teste@testeteste.com","Texas");
        toRegister();

    }
    public void fillEmail(String email){
        loginPage.getEmailTextField().sendKeys(email);

    }

    public void submitEmail(){
        loginPage.getButtonSubmit().click();

    }
    public void fillFormPersonal(String name, String lastname, String password){
        loginPage.getNameTextField().sendKeys(name);
        loginPage.getLastNameTextField().sendKeys(lastname);
        loginPage.getPasswordTextField().sendKeys(password);
    }

    public void fillFormAdress(String address,String city,String cep, String cel,String alias,String state){

        loginPage.getAdressTextField().sendKeys(address);
        loginPage.getCityTextField().sendKeys(city);

        WebElement elementState = loginPage.getStateSelectField();
        new Select(elementState).selectByVisibleText(state);

        loginPage.getCepTextField().sendKeys(cep);

        loginPage.getCelTextField().sendKeys(cel);
        WebElement elementAlias = loginPage.getAliasTextField();
        elementAlias.clear();
        elementAlias.sendKeys(alias);



    }

    public void toRegister(){

        WebElement buttonRegister = loginPage.getRegisterButton();
        wait.until(ExpectedConditions.visibilityOf(buttonRegister));
        buttonRegister.click();
    }
}
