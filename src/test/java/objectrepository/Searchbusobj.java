package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class Searchbusobj {
	public Searchbusobj() {
		PageFactory.initElements(Hook.driver,this);
	}
	
	@FindBy(xpath="//a[@class='btnab icosearch']")
	private WebElement searchBtn;

	public WebElement getSearchBtn() {
		return searchBtn;
		
		}

}
