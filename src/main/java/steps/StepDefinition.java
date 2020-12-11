package steps;

import org.junit.Assert;

import base.BasePage;

import cucumber.api.java.en.*;
import object.ObjectPage;

public class StepDefinition{
	BasePage bp;
	ObjectPage op;
	
	
	public StepDefinition() {
		bp=new BasePage();
		op=new ObjectPage();
	}
	@Given("^: go to login page$")
	public void go_to_login_page() throws Throwable {
		bp=new BasePage();
	}

	@When("^: i enter the \"(.*?)\" and \"(.*?)\"$")
	public void i_enter_the_and(String arg1, String arg2) throws Throwable {
		bp.setText(op.getUser(),arg1);
		bp.setText(op.getPass(), arg2);
		bp.click1(op.getLogin());
	}

	@Then("^: i should see the search page$")
	public void i_should_see_the_search_page() throws Throwable {
		String text="AdactIn.com - Search Hotel";
		String getTitle=bp.getTitle1();
		Assert.assertTrue(text.equals(getTitle));
	    
	}
	@When("^: i entered the  \"(.*?)\" and  \"(.*?)\"$")
	public void i_entered_the_and(String arg1, String arg2) throws Throwable {
		bp.naviBack();
		bp.setText(op.getUser(),arg1);
		bp.setText(op.getPass(), arg2);
		bp.click1(op.getLogin());
	    
	}

	@Then("^: i should get invalid message$")
	public void i_should_get_invalid_message() throws Throwable {
	    op.getError();
	}




}
