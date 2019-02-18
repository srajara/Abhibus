package stepdefinition;

import cucumber.api.java.en.Then;
import objectrepository.ValidateBusObjAvailability;

public class ValidationPage {
	
	
	@Then("validate the details")
	public void validate_the_details() {
		ValidateBusObjAvailability val = new ValidateBusObjAvailability();
		System.out.println("VAlidation Page output "+val.getValidation().getText());
	    
		//System.out.println("ReturnVAlidation Page output "+val.getValidation().getText());
	}

}
