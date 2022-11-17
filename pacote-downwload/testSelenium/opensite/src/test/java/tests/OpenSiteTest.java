package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenSiteTest {
	
	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.edge.driver", "\"C:\\Users\\gabri\\Downloads\\edgedriver_win32\\msedgedriver.exe\"");
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
		Thread.sleep(3000);
		WebElement privacidade = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div[2]/button"));
		privacidade.click();
		WebElement colocarCarrinho = driver.findElement(By.xpath("/html/body/div/div/main/section[4]/div[6]/div[2]/button/span"));
		colocarCarrinho.click();
		Thread.sleep(3000);
		WebElement irSacola = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section[2]/div[2]/div/div[2]/div/div[1]/div[2]/button"));
		irSacola.click();
		Thread.sleep(5000);
		Select period = new Select(driver.findElement(By.className("BasketItemProduct-quantity-dropdown")));
		period.selectByVisibleText("2");
		String value = period.getFirstSelectedOption().getAttribute("value");
		Thread.sleep(3000);
		WebElement excluir = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/button/span"));
		excluir.click();
		Thread.sleep(3000);
	}

}
