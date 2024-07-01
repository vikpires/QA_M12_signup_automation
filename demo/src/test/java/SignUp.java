import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUp {

    private WebDriver navigator;

    @BeforeTest
    public void setUp(){
        navigator = new FirefoxDriver();
        navigator.get("https://automationexercise.com/login");
    }

    @Test
    public void firefoxTest(){
               
        //Criando Formulário de Pré-Cadastro
        WebElement loginNewUser = navigator.findElement(By.className("signup-form"));

        //Gerar nome de usuário e email automaticamente
        String username = RandomStringUtils.randomAlphanumeric(9); 
        String domain = "@teste.com";
        String email = username + domain;
        
        //Preencher o campo "Name"
        loginNewUser.findElement(By.name("name")).sendKeys(username);

        //Preencher o campo "Email"
        loginNewUser.findElement(By.name("email")).sendKeys(email);

        //Clicar no botão "SignUp" 
        navigator.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
    
        //Criar Formulário de Cadastro
        WebElement signUp = navigator.findElement((By.id("form")));

        //Preencher o campo "Gênero"
        signUp.findElement(By.id("id_gender2")).click();

        //Preencher o campo "Password"
        signUp.findElement(By.id("password")).sendKeys("123456");

        //Preencher o campo "Day"
        signUp.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select/option[8]")).click();

        //Preencher o campo "Month"
        signUp.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select/option[5]")).click();

        //Preencher o campo "Year"
        signUp.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select/option[3]")).click();

        //Clicar checkbox "Newsletter"
        signUp.findElement(By.id("newsletter")).click();

        //Clicar checkbox "Offer"
        signUp.findElement(By.id("optin")).click();

        //Preencher o campo "First Name"
        signUp.findElement(By.id("first_name")).sendKeys("Ada");

        //Preencher o campo "Last Name"
        signUp.findElement(By.id("last_name")).sendKeys("Lovelace");

        //Preencher o campo "Company"
        signUp.findElement(By.id("company")).sendKeys("XYZ");
        
        //Preencher o campo "Address"
        signUp.findElement(By.id("address1")).sendKeys("Rua Z");

        //Preencher o campo "Country"
        signUp.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[6]/select/option[1]")).click();

        //Preencher o campo "State"
        signUp.findElement(By.id("state")).sendKeys("ABC"); 

        //Preencher o campo "City"
        signUp.findElement(By.id("city")).sendKeys("ABC");    

        //Preencher o campo "ZipCode"
        signUp.findElement(By.id("zipcode")).sendKeys("00000000");   

        //Preencher o campo "Mobile Number"
        signUp.findElement(By.id("mobile_number")).sendKeys("999999999");         
        
        //Clicar no botão "Create Account"
        navigator.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();
    }

    @AfterTest
    public void tearDown(){
        navigator.quit();
    }
    
}
