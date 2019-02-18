package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class Fillthedetailsobjpage {
	
	public Fillthedetailsobjpage() {
		PageFactory.initElements(Hook.driver,this);
	}

	@FindBy(id="source")
	private WebElement SourceLocation;
	@FindBy(id="destination")
	private WebElement destLocation;
	
	@FindBy(id="datepicker1")
	private WebElement datePicker; 
	
	public WebElement getDatePicker() {
		return datePicker;
	}

	@FindBy(xpath="//div[@id=\"tomorrowdiv\"]")
	private WebElement dateofTravel;
	

	public WebElement getDateofTravel() {
		return dateofTravel;
	}

	public WebElement getDestLocation() {
		return destLocation;
	}

	public WebElement getSourceLocation() {
		return SourceLocation;
	}
	

	
	@FindBy(id="datepicker2")
	private WebElement ReturnDate;
	
	@FindBy(xpath="//a[text()='23']")
	private WebElement ReturnTmrDate;

	

	public WebElement getReturnDate() {
		return ReturnDate;
	}

	public WebElement getReturnTmrDate() {
		return ReturnTmrDate;
	}

	
	
}
