package pagetest;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;

import pageobjects.ReservaPageObject;
import util.Configurations;
import util.ExcelRead;
import util.Utilidad;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TestReserva {
	
	private WebDriver driver;
	ReservaPageObject reservaPageObject;
	Configurations configuration;
	Utilidad utilidad;
	
	
@Test(dataProvider = "dataPool")
public void reservaPage(Hashtable<String, String> data) throws Exception {
reservaPageObject.reservaPage(data);
	  Thread.sleep(2000);
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  configuration = new Configurations();
	  reservaPageObject = new ReservaPageObject(driver);
	  configuration.CargarConfig();
	  driver = reservaPageObject.chromeDriver();
	  reservaPageObject.page(configuration.url);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  System.out.println("Ejecucion terminada");
  }
  
  @DataProvider
  public Object[][] dataPool() throws FilloException {
   ExcelRead reader = new ExcelRead(1);
   return reader.getExcelData();
  }
  
}
