import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfter {

    private WebDriver navigator;

    @BeforeTest
    public void setUp(){
        navigator = new FirefoxDriver();
        navigator.get("https://automationexercise.com/login");
    }

    @Test
    public void firefoxTest(){
               
        //Criando Formulário de Pré-cadastro
        WebElement loginNewUser = navigator.findElement(By.className("signup-form"));

        //Preencher o campo "Name"
        loginNewUser.findElement(By.name("name")).sendKeys("nomeCurso");

        //Preencher o campo "Email"
        loginNewUser.findElement(By.name("email")).sendKeys("emailTeste01@teste.com");

        //Clicar no botão "SignUp" (Ideal usar id, name ou xpath)
        navigator.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
    }
    @AfterTest
    public void tearDown(){
        navigator.quit();
    }
    
}