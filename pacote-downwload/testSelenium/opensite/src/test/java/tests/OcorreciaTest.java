package tests;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OcorreciaTest {
	
	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\gabri\\Downloads\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() throws Exception{
		driver.quit();
	}
	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.magazineluiza.com.br/");
		WebElement pesquisarProduto = driver.findElement(By.id("input-search"));
		pesquisarProduto.clear();
		pesquisarProduto.sendKeys("Nintendo Switch");
		Thread.sleep(3000);
		WebElement clicarPesquisa = driver.findElement(By.xpath("//*[@id=\"input-search\"]"));
		clicarPesquisa.click();
		clicarPesquisa.submit();
		Thread.sleep(3000);
		WebElement clicaProduto = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section[4]/div[3]/div/ul/li[1]/a/div[2]/img"));
		clicaProduto.click();
		Thread.sleep(5000);
		WebElement clicarFavorito = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section[4]/div[1]/div/div[4]/div/button"));
		clicarFavorito.click();
		Thread.sleep(6000);
		
		List <WebElement> listOfElement = driver.findElements(By.className("FormGroup-input"));
		
		listOfElement.get(1).click();
		listOfElement.get(1).sendKeys("gabrielmoreirabr@outlook.com");
		Thread.sleep(2000);
		
		listOfElement.get(2).click();
		listOfElement.get(2).sendKeys("180195");
		
		Thread.sleep(6000);
		

		List <WebElement> listOfElement2 = driver.findElements(By.className("LoginBox-form-continue"));
		
		listOfElement2.get(1).click();
		Thread.sleep(5000);
		
		WebElement clicarFavorito2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section[4]/div[1]/div/div[4]/div/button"));
		clicarFavorito2.click();
		Thread.sleep(6000);
		
		WebElement clicarAbafavorito = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section[1]/div[2]/header/div/div[2]/a[1]/div/button"));
		clicarAbafavorito.click();
		Thread.sleep(5000);
		
		
	}
}