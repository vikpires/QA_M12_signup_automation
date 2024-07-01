import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PreSignUp {
    @Test
    public void firefoxTest(){
        WebDriver navigator = new FirefoxDriver();
        navigator.get("https://automationexercise.com/login");
        
        //Criando Formulário de Pré-Cadastro
        WebElement loginNewUser = navigator.findElement(By.className("signup-form"));

        //Preencher o campo "Name"
        loginNewUser.findElement(By.name("name")).sendKeys("nomeCurso");

        //Preencher o campo "Email"
        loginNewUser.findElement(By.name("email")).sendKeys("emailTesteQA@teste.com");

        //Clicar no botão "SignUp"
        navigator.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();

        // navigator.quit();

    }
    
}
