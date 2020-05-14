package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lombok.Getter;


@Getter
public class PageElement extends PageBase {
		
	public PageElement(WebDriver driver) {
		super(driver);
	}

	By frame1			= By.xpath("//*[@id=\"sleeknote-cover\"]");
	By popup1			= By.id("form75a1d722-91f3-4fe2-aac4-6e6cbcbae155");
	
	By popVolveremos	= By.xpath("/html/body/section/form/ul/li[1]/div");
	By ciudadOrigen		= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[3]/div[1]/div/form/div/div[2]/div/div/div[1]/fieldset/div/div[1]/div/label/div/input[1]");
	By ciudadDestino	= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[3]/div[1]/div/form/div/div[2]/div/div/div[1]/fieldset/div/div[3]/div[2]/label/div/input[1]");
	By fechaIda			= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[3]/div[1]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[1]/label/div/div/input[1]");
	By fechaRegreso		= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[3]/div[1]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[1]/label/div/div/input[3]");
	By pasajeroClase	= By.name("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[3]/div[1]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[1]/div[1]/label/div/input']");
	By buscarVuelo  	= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[3]/div[1]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[4]/button[@title='Buscar vuelos']");
	By clickCalendario  = By.xpath("//*[@id='ida_regreso_1_1740547020']/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[1]/label/div/div/span/i");
	
	By toltiftPbOri  	= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[3]/div[1]/div/form/div/div[2]/div/div/div[1]/fieldset/div/div[1]/div/div/ul/li[1]");		
	By toltiftPbDes  	= By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[3]/div[1]/div/form/div/div[2]/div/div/div[1]/fieldset/div/div[3]/div[2]/div/ul/li[1]");
	By botonCovid  		= By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/section/article/button");
	By btncookies		= By.xpath("//*[@id='cookiePolicy']/div/div/div[2]/button");
	By btnAdelMes		= By.xpath("//div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[2]/div[1]/table/tbody/tr/td[2]/div[1]/div[2]");
	By calendar			= By.xpath("//div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[2]/div[1]/table/tbody/tr/td[1]/div[3]/table/tbody");
	By monthcalendar	= By.xpath("//div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[2]/div[1]/table/tbody/tr/td[1]/div[1]/div[2]");
	
	// pagina dos de la busqueda //
	//***************************************************************************************//
	
	By selectVueloida		= By.xpath("//*[@id='tpl3_price-fareGroup0-bound0-row0-flightId2']/div");
	By btnVueloida			= By.xpath("/html/body/section/section/div/section/section/div[2]/div/div/section/section/div[1]/div/div/div[2]/div[4]/aside/div/div/div/div[6]/span[1]/div/button");
	By selectVueloregre		= By.xpath("//*[@id='tpl3_price-fareGroup0-bound1-row0-flightId0']");
	By btnfinalizar			= By.xpath("//*[@id='w169']");
	//*[@id="tpl3_price-fareGroup0-bound0-row0-flightId2"]/div/span[1]
	//*[@id="group-bound-0-flight-2-fareGroup-0"]
	//*[@id="group-bound-1-flight-0-fareGroup-0"]
}
