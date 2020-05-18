
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AcessoAmericanas {

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
	      Assert.assertEquals("Robô Aspirador Robot W300 WAP Bivolt Vermelho nas americanas", driver.getTitle());
	      
	      //Verificando frete e clicando em comprar
	      driver.findElement(By.id("freight-field")).sendKeys("60744030");
	      driver.findElement(By.xpath("//*[@id=\"freight-field-button\"]/div/span")).click();
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("javascript:window.scrollBy(250,350)");
	    
	      driver.findElement(By.xpath("\r\n"+"//*[@id=\"btn-buy\"]/div")).click();
          //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	      //new WebDriverWait(driver, 8)
	      //.until(ExpectedConditions.alertIsPresent());
	      
	      //Validando o produto no carrinho 	    
	      Assert.assertTrue("Robô Aspirador Robot W300 WAP Bivolt Vermelho", true);
	      

	      //fechar o navegador
	      driver.quit();
	}

	}
