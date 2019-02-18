package stepdefinition;

import cucumber.api.java.en.When;
import objectrepository.Searchbusobj;

public class SearchBus {


@When("Click the Search")
public void click_the_Search() {
	
	Searchbusobj searchBtnClk = new Searchbusobj();
	
	searchBtnClk.getSearchBtn().click();
 
 
}
}
