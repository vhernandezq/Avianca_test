package pageobjects;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;

public class ReservaPageObject extends PageElement {
	
//	private PageElement pageElement;
	ReservaPageObject reservaPageObject;
	
	public ReservaPageObject(WebDriver driver) {
		super(driver);
	}
	
//	private WebDriver driver;

	public void reservaPage(Hashtable<String, String> data) throws Exception {
		//	switchPage(this.frame1);
	   	try {
			click(botonCovid);
		//	click(btncookies);
			
			click(this.ciudadOrigen);
			clear(this.ciudadOrigen);
			type(data.get("bpOrigen"), this.ciudadOrigen);
			click(this.toltiftPbOri);
			Thread.sleep(500);
			click(this.ciudadDestino);
			type(data.get("bpDestino"), this.ciudadDestino);
			click(this.toltiftPbDes);
			Thread.sleep(500);
			
			click( this.fechaIda);
			selectdatePicker(this.calendar, this.monthcalendar, this.btnAdelMes, data.get("feInicio"));
			selectdatePicker(this.calendar, this.monthcalendar, this.btnAdelMes, data.get("feLlegada"));
			tomaEvidencia();
			click(this.buscarVuelo);
			// Pasa a la siguiente pantalla
			isDisplayed(this.btnVueloida);
			click(this.selectVueloida);
			isDisplayed(this.btnVueloida);
			click(this.btnVueloida);
			isDisplayed(this.btnfinalizar);
			click(this.selectVueloregre);
			isDisplayed(this.btnfinalizar);
		//	click(this.btnfinalizar);
			tomaEvidencia();
			Thread.sleep(5000);
			System.out.println("llego a pagina reserva");
	   	}
	   	catch(Exception e) {
	   		System.out.println("se genero un error : " + e);
	   		tomaEvidencia();
	   	}
			
	}
	
	public String reservaMessage() {
		return "";
	}
	
}
