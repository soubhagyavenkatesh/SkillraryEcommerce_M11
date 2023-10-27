package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
		//Declaration
		//address of facebook
			@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
			private WebElement facebook;
			
			//initization
			public TestingPage(WebDriver driver) 
			{
				PageFactory.initElements(driver,this);
			}

			
			
			//utilization
			
public WebElement getFacebook() {
	return facebook;
}
//Business library
public void FacebookWebElement()
{
	facebook.click();
}



public WebElement getfacebook() {
	// TODO Auto-generated method stub
	return null;
}



public void facebookWebElement() {
	// TODO Auto-generated method stub
	
}

}