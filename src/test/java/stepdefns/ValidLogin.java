package stepdefns;

import java.util.List;
import java.util.Map;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class ValidLogin extends TestBase {
	
	LoginPage loginpage;
//User is on Login Page
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		initialize();

}
	//User enter login credentials
	@When("User enter login credentials")
	public void User_enter_login_credentials(DataTable userCred) {
		loginpage=new LoginPage();
		List<Map<String, String>> data = userCred.asMaps();
        String strUser = data.get(0).get("username");
        String strPwd = data.get(0).get("password");
        loginpage.login(strUser, strPwd);
		
		}
	
	
	//User creates contact
	@Then("User creates contact")
			public void User_creates_contact() {
		
	}
	
	//Close the browser
	@And("Close the browser")
	public void Close_the_browser() {
		
	}
}
