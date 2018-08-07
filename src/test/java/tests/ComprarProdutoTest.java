package tests;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddressPage;
import suport.Web;
import tasks.PaymentTasks;
import tasks.ProductTasks;
import tasks.RegisterUsersTasks;
import tasks.ShippingTasks;
import verifications.AddressVerification;
import verifications.PrecoTotalVerification;
import verifications.ProductVerification;
import verifications.ShopVerification;

import java.util.concurrent.TimeUnit;

public class ComprarProdutoTest {

    private WebDriver driver;
    private WebDriverWait wait;

    private RegisterUsersTasks registerUsersTasks;
   private ProductTasks productTasks;
   private ShopVerification shopVerification;

   private AddressPage addressPage;

   private ProductVerification productVerification;
   private AddressVerification addressVerification;
    private ShippingTasks shippingTasks;
    private PrecoTotalVerification precoTotalVerification;
    private PaymentTasks paymentTasks;


    @Before
    public void setUp(){

        driver = Web.getInstanceChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        //Acessando o site
        driver.get("http://www.automationpractice.com");

        registerUsersTasks = new RegisterUsersTasks(driver);
        productTasks = new ProductTasks(driver);
        precoTotalVerification = new PrecoTotalVerification(driver);
        paymentTasks = new PaymentTasks(driver);
        shopVerification = new ShopVerification(driver);
        productVerification = new ProductVerification(driver);
        addressVerification = new AddressVerification(driver);
        shippingTasks = new ShippingTasks(driver);

    }

    @Test
    public void testComprarProduto(){

        //Escolhendo o produto e adicionando ao carrinho
        productTasks.addProduct();

        //Verificando se o produto foi adicionado corretamente
        productVerification.productCheck();

        //Realizando o cadastro
        registerUsersTasks.register();

        //Validando o endereco
        addressVerification.addressCheck();

        //Aceitando os termos de servico
        shippingTasks.aceitarTermos();

        //Validando o preco total
        precoTotalVerification.precoTotalCheck();

        //Selecionando Pagamento
        paymentTasks.pay();

        //Validando a compra
        shopVerification.shopCheck();

    }

    @After
    public void tearDown(){

         Web.closeChromeDriver();

    }
}
