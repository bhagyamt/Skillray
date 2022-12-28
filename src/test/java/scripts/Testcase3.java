
package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlibraries.StepGroup;
import pomPages.Addtocart;
import pomPages.Selenium;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLogin;
import pomPages.WishList;

public class Testcase3 extends StepGroup {

	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLogin s = new SkillraryLogin(driver);
		s.serachtextbox(pdata.getPropertydata("coursename"));
		s.serachbutton();

		Selenium se = new Selenium(driver);
		se.corejavaselenium();

		WishList w = new WishList(driver);
		w.closepopup();
		driverutilities.switchframe(driver);

		w.playbtn();
		Thread.sleep(10000);
		w.pausebtn();
		driverutilities.switchbackframe(driver);
		w.wishlist();

	}
}
