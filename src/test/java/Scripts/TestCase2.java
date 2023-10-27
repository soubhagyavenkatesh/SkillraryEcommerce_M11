package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.DownlooadInvoicePage;
import POM.SkillraryHomePage;
import generic_library.BaseClass;

public class TestCase2 extends BaseClass {
	@Test
	public void tcl() throws Throwable
	{
		SkillraryHomePage s= new SkillraryHomePage(driver);
		s.gearsButton();//business librarary of gears from skillraryHomepage
		s.skillraryDemoApp();
		utilities.childBrowser(driver);
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		ds.feedBckbtn();
		DownlooadInvoicePage dI =new  DownlooadInvoicePage(driver);
        dI.downloadInvoiceButton();

}
}
