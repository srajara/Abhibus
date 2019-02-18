package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class ValidateBusObjAvailability {
	public ValidateBusObjAvailability() {
		PageFactory.initElements(Hook.driver,this);
	}
	
	@FindBy(id="SubHeadJrney")
	private WebElement Validation;
	
	@FindBy(id="SubHeadJrney")
	private WebElement returnValidation;

	public WebElement getReturnValidation() {
		return returnValidation;
	}

	public WebElement getValidation() {
		return Validation;
	}
	

}
