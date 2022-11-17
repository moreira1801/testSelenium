package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToolsQA {
	
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
	public void test() throws InterruptedException {
		driver.get("https://www.magazineluiza.com.br/");
		}
	}

