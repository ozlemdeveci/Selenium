package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EmergencyContactSteps extends CommonMethods{
	@Given("I am logged into HRMS")
	public void i_am_logged_into_HRMS() {
	    login.login();
	}

	@Given("I navigated to Add Employee Page")
	public void i_navigated_to_Add_Employee_Page() {
	   dashboard.navigateToAddEmployee();
	}

	@Given("I add firstName, middleName and last name")
	public void i_add_firstName_middleName_and_last_name() {
	  sendText(addEmp.firstName, "Orhan");
	  sendText(addEmp.middleName, "Gencebay");
	  sendText(addEmp.lastName, "abi");
	}

	@Given("I click Save button")
	public void i_click_Save_button() {
	 click(addEmp.saveBtn);
	}

	@Then("I will see Personal Details")
	public void i_will_see_Personal_Details() {
	   boolean displayed=perDetails.empPicture.isDisplayed();
	 Assert.assertTrue("Employee pic is not displayed", displayed);
	}

	@Then("I navigate to emergency contact page")
	public void i_navigate_to_emergency_contact_page() throws InterruptedException {
		Thread.sleep(5000);
	perDetails.EmergencyButton.click();
	Thread.sleep(5000);
	}

	@Then("I enter emergency contact detail")
	public void i_enter_emergency_contact_detail(DataTable data) throws InterruptedException {
	   List<Map<String, String>> emergencyList=data.asMaps();
	   for(Map<String, String> emgC:emergencyList) {
		   jsClick(emergencyCon.addButtonForEmergency);
		   sendText(emergencyCon.emgName, emgC.get("Name"));
		   sendText(emergencyCon.emgRelationship,emgC.get("Relationship"));
		   sendText(emergencyCon.emgHomeTel, emgC.get("HomePhoneNumber"));
		   sendText(emergencyCon.emgMobileTel, emgC.get("MobilePhone"));
		   sendText(emergencyCon.emgWorkTel, emgC.get("workphone"));
		   Thread.sleep(3000);
		   jsClick(emergencyCon.EmgSaveBtnCon);
	   }
	}

	@Then("I confirm saved emergency detail")
	public void i_confirm_saved_emergency_detail() {
	   boolean displayedPic=emergencyCon.empPicture.isDisplayed();
	 Assert.assertTrue("Employee pic is not displayed", displayedPic);
	}


}
