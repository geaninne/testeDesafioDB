package suport;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;

/*Tira print da pagina e copia para um arquivo*/
public class Screenshot {

    public static void printScreen (WebDriver navegador,String arquivo){

        File screenchot = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
       try{
           FileUtils.copyFile(screenchot,new File(arquivo));
       }catch (Exception e){
            System.out.println("Erro ao copiar o arquivo para a pasta" + e.getMessage());       }
    }
}
