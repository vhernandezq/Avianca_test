package pageobjects;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import util.Configurations;
import util.Utilidad;

public class PageBase {

	Utilidad utilidad = new Utilidad();
	
	private WebDriver driver;
	
	public PageBase(WebDriver driver) {
	}

	public WebDriver getDriver() {
		return driver;
	}

	 public WebDriver chromeDriver() {
		 System.setProperty("webdriver.chrome.driver", Configurations.driverChrome);
		 driver = new ChromeDriver();
		 return driver;
	 }
	 
	 public WebElement findElement(By locator) throws InterruptedException {
		 Thread.sleep(500);
		 return driver.findElement(locator);
	 }
	 
	 public List<WebElement> findElements(By locator) throws InterruptedException{
		 Thread.sleep(500);
		 return driver.findElements(locator);
	 }
	 
	 public String getText(WebElement element) throws InterruptedException {
		 Thread.sleep(500);
		 return element.getText();
	 }
	 
	 public String getText(By locator) throws InterruptedException {
		 Thread.sleep(500);
		 return driver.findElement(locator).getText();
	 }
	 
	 public void type(String inputText, By locator) throws InterruptedException {
		 Thread.sleep(500);
		 driver.findElement(locator).sendKeys(inputText);
	 }
	 
	 public void click(By locator) throws InterruptedException {
		 Thread.sleep(500);
		 driver.findElement(locator).click();
	 }
	 
	 public void clear(By locator) throws InterruptedException {
		 Thread.sleep(500);
		 driver.findElement(locator).clear();
	 }
	 
	 public void switchPage1(By locator) throws InterruptedException {
		 Thread.sleep(500);
		 driver.switchTo().frame(driver.findElement(locator));
	 }
	 
	 
	  public  Boolean isDisplayed(By locator) throws InterruptedException  {
		  System.out.println("Entro a Espera_Objeto!");
		  Boolean isPresent = false;
		  if (1 > 0){
	        	
	        	for (int jj = 0; jj < 21; jj++){ 	
	        		try   
				    { 
	        		
		        	isPresent = driver.findElement(locator).isDisplayed();
		                	        		
			        if 	(isPresent.equals(true) ) {
			        	 jj=20;
			        	 System.out.println("Objeto Encontrado! " + locator);
			        	 Thread.sleep(2000);
			        	}
			        else {
			        	System.out.println("Objeto no encontrado else! " + locator);
				  		Thread.sleep(1000);
			        	}
				}catch(org.openqa.selenium.NoSuchElementException e)     
				{       
			  		System.out.println("Objeto no encontrado Exection! "+ locator);
			  		Thread.sleep(1000);
				}
		        }
		    }
		  return isPresent;
      	}
	  
	 public void switchPage(By locator) throws InterruptedException {
		 Thread.sleep(500);
		 driver.switchTo().frame(driver.findElement(locator));
	 }
	 
	 public void page(String url) throws Exception {
		 driver.get(url);
		 Thread.sleep(500L);
		 driver.manage().window().maximize();
	 }
	 
	 public void selectMonth(By locator, By locator2, String monthDate) {
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 }

    public void selectdatePicker(By locator, By locator1, By locator2, String date) throws Exception {
  
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String[] fecha = date.split("-");
        String ano = fecha[0];
        String mes = fecha[1];
        String dia = fecha[2];
        
        for(int i=0; i<12;i++) {
        	String mesAct = getText(locator1);
        	String[] fechaDate = mesAct.split(" ");
        	String mesDate = fechaDate[0];
        	String anoDate = fechaDate[1];

        	if (mesDate.equals(mes)) {
        		if (anoDate.equals(ano)) {
	    	        WebElement dateWidgetFrom = driver.findElement(locator);
	    	        List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
	
	    	        for (WebElement cell: columns) {
	    	            if (cell.getText().equals(dia)) {
	    	                cell.click();
	    	                break;
	    	            }
	    	        }
	    	        break;
        		}else {
        			 click(locator2); 
        		}
        	}else {
   			 click(locator2); 
   		}
        	
        }
        System.out.println("selecciono la fecha  : " + date + "\n");
        Thread.sleep(500);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static Configurations configuration;
	public static void tomaEvidencia() throws Exception
    {
	try {
	    Thread.sleep(1000);
	    BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	    ImageIO.write(image, "jpg", new File(configuration.pathHTML +"/screenshot_"+ timeStamp + ".jpg")); 
	}
	 catch (Exception e) { 
		 	e.printStackTrace(); 
	 		}
    }
	    
	    
	    
}
