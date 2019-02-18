package objectrepository;

import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class homepageobj {
	
	public homepageobj() {

		PageFactory.initElements(Hook.driver,this);
	}

	
}
