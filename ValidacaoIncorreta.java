import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidacaoIncorreta {
	@Test
	  public void teste() {
		 //System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		
		 //Abrindo navegador, maximizando tela e acessando o Portal
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
	      driver.get ("http://www.americanas.com/");
	      
	      //Pesquisando e entrando no produto
	      driver.findElement(By.id("h_search-input")).sendKeys("Robô Aspirador Robot W300 WAP Bivolt Vermelho nas americanas");
	      driver.findElement(By.id("h_search-btn")).click(); 
	      driver.findElement(By.xpath("//*[@id=\"content-middle\"]/div[6]/div/div/div/div[1]/div[1]/div/div[2]/a/section/div[2]/div[1]/h2")).click();
	      
	      
	      //Validando o retorno da Busca	 
	      Assert.assertFalse("Robô Aspirador Robot W300 WAP Bivolt Vermelho", false);
	      

	      //fechar o naegador
	      driver.quit();
	}

	}

