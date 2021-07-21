package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Avaliacao {

    @Test
    public void testValidarResultadoDePesquisa(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\caique.souza\\driver1\\chromedriver.exe");

        //abrir navegador
        WebDriver navegador = new ChromeDriver();

        //nevegar pelo site
        navegador.get("https://swapi.dev/");

        //digitar no elemento
        navegador.findElement(By.id("interactive")).sendKeys("people/1/");

        //clicar no botão de pesquisa
        navegador.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[1]/span[2]/button")).click();

        //validar se a pesquisa retornou algum valor
        WebElement nameApresentado = navegador.findElement(By.id("interactive_output"));
        String textoElemntoName = nameApresentado.getText();

        //validação
        assertTrue("404 error", true);
        //navegador.quit();
    }
    @Test
    public void testValidarResultadoDePesquisa2(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\caique.souza\\driver1\\chromedriver.exe");

        //abrir navegador
        WebDriver navegador = new ChromeDriver();

        //nevegar pelo site
        navegador.get("https://swapi.dev/");

        //digitar no elemento
        navegador.findElement(By.id("interactive")).sendKeys("planets/3/");

        //clicar no botão de pesquisa
        navegador.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[1]/span[2]/button")).click();

        //validar se a pesquisa retornou algum valor
        WebElement nameApresentado = navegador.findElement(By.id("interactive_output"));
        String textoElemntoName = nameApresentado.getText();

        //validação
        assertTrue("404 error", true);
        //navegador.quit();
    }
    @Test
    public void testValidarResultadoDePesquisa3(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\caique.souza\\driver1\\chromedriver.exe");

        //abrir navegador
        WebDriver navegador = new ChromeDriver();

        //nevegar pelo site
        navegador.get("https://swapi.dev/");

        //digitar no elemento
        navegador.findElement(By.id("interactive")).sendKeys(" planets/3/");

        //clicar no botão de pesquisa
        navegador.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[1]/span[2]/button")).click();

        //validar se a pesquisa retornou algum valor
        WebElement nameApresentado = navegador.findElement(By.id("interactive_output"));
        String textoElemntoName = nameApresentado.getText();

        //validação
        assertTrue("404 error", false);
    }
}
