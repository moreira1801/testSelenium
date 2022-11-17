package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Teste2 {
	
		private WebDriver driver;

		@Before
		public void setUp() throws Exception{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\gabri\\AppData\\Local\\Temp\\Temp2_edgedriver_win32.zip\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			
		}
		
		@After 
		public void tearDown() throws Exception{
			driver.quit();
		}
		
		@Test
		public void test() throws InterruptedException{
			driver.get("http://165.227.93.41/lojinha-web/v2/");
			Thread.sleep(3000);
			WebElement clicarUsuario = driver.findElement(By.id("usuario"));
			clicarUsuario.sendKeys("admin");
			WebElement clicarSenha = driver.findElement(By.id("senha"));
			clicarSenha.sendKeys("admin");
			WebElement clicarEntrar = driver.findElement(By.name("action"));
			clicarEntrar.click();
			WebElement adicionarProduto = driver.findElement(By.xpath("/html/body/div[2]/div/div/a"));
			adicionarProduto.click();
			WebElement nomeProduto = driver.findElement(By.id("produtonome"));
			nomeProduto.click();
			nomeProduto.sendKeys("nintendo wii");
			WebElement valorProduto = driver.findElement(By.id("produtovalor"));
			valorProduto.click();
			valorProduto.sendKeys("650,00");
			WebElement corProduto = driver.findElement(By.id("produtocores"));
			corProduto.click();
			corProduto.sendKeys("branco");
			WebElement clicarSalvar = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[5]/button"));
			clicarSalvar.click();
			WebElement listaProdutos = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/form/div[4]/a"));
			listaProdutos.click();
			WebElement excluirProdutos = driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[185]/a/i"));
			excluirProdutos.click();
			Thread.sleep(3000);
		}
}
