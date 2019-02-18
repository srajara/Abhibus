package stepdefinition;

import cucumber.api.java.en.Given;

public class homepage {
	
	@Given("User entering in to Abi Bus URL")
	public void user_entering_in_to_Abi_Bus_URL() {
	//	homepageobj hme=new homepageobj();
		Hook.driver.get("https://www.abhibus.com/");
	}

}
