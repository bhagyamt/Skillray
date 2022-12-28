package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin {

	@FindBy(xpath="//a[text()=' GEARS ']")
	//a[text()=' GEARS ']
	private WebElement gearstab;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'] )[2]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement gobtn;
	
	public SkillraryLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	
	public void gearButton() {
		gearstab.click();
	}
	
	public void demoskillraryapp() {
		demoapp.click();
	}
	
	public void serachtextbox(String course) {
		serachtb.sendKeys(course);
	}
	
	public void serachbutton() {
		gobtn.click();
	}
}
