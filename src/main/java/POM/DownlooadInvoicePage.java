package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownlooadInvoicePage {
	
		//Declaration
		//address of select download invoice
			@FindBy(xpath="//input[@name='downloadInvoice']")
			private WebElement downloadInvoicebtn;
			
			//intialization
			public  DownlooadInvoicePage(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}

			
			//Utilozation

			

			public WebElement getDownloadInvoicebtn() {
				return downloadInvoicebtn;
			}

			//Business library
			public void downloadInvoiceButton()
			{
				downloadInvoicebtn.click();
			}
}
