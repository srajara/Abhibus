package stepdefinition;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import cucumber.api.java.en.When;
import objectrepository.Fillthedetailsobjpage;

public class Fillthedetailspage {
	@When("Fills source and destination {string},{string}")
	public void fills_source_and_destination(String scr, String des) throws AWTException, Exception  {
		
		Fillthedetailsobjpage fill=new Fillthedetailsobjpage();
		Robot rc = new Robot();
		fill.getSourceLocation().sendKeys(scr);
		Thread.sleep(3000);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER );
		
		fill.getDestLocation().sendKeys(des);
		Thread.sleep(3000);
		rc.keyPress(KeyEvent.VK_TAB);
		rc.keyPress(KeyEvent.VK_ENTER);
		fill.getDatePicker().click();
		fill.getDateofTravel().click();
		//Thread.sleep(3000);
		//fill.getReturnDate().click();
		//fill.getReturnTmrDate().click();
		
		
	}

}
