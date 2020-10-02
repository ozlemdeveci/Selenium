package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.junit.Test;

public class SampleAPITest {

	// @Test
	public void getAllJobTitles() {

		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Beaver eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzI4OTcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4ODA5NywidXNlcklkIjoiMzU2In0.OUuUjaRr4dGNxHd47WU_9u3ofscYCeaYSZBANCUphi8")
				.when().get("http://54.167.125.15/syntaxapi/api/jobTitle.php");

		response.prettyPrint();
		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);

	}

	// @Test
	public void getOneEmployee() {
		Response response = RestAssured.given().param("employee_id", "3372").contentType("application/json").header(
				"Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzI4OTcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4ODA5NywidXNlcklkIjoiMzU2In0.OUuUjaRr4dGNxHd47WU_9u3ofscYCeaYSZBANCUphi8")
				.when().get("http://54.167.125.15/syntaxapi/api/getOneEmployees.php");

		response.prettyPrint();
	}

	public void getAllEmployees() {

		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzEyOTksImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4NjQ5OSwidXNlcklkIjoiNTcifQ.ZGVtp5MiJTNlWLN_bm_TLt7fVkITLYifB-fu2Im_KZk")
				.when().get("http://54.167.125.15/syntaxapi/api/getAllEmployees.php");

		response.prettyPrint();
	}

	/*
	 * Task:getAllEmployeeStatuses pretty print print status code
	 * 
	 */
	@Test
	public void getAllEmployeeStatuses() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzI4OTcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4ODA5NywidXNlcklkIjoiMzU2In0.OUuUjaRr4dGNxHd47WU_9u3ofscYCeaYSZBANCUphi8")
				.when().get("http://54.167.125.15/syntaxapi/api/employeeStatus.php");

		response.prettyPrint();
		int actualResponseCode = response.getStatusCode();
		System.out.println("Response code" + actualResponseCode);

	}

	@Test
	public void createEmployee() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzI4OTcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4ODA5NywidXNlcklkIjoiMzU2In0.OUuUjaRr4dGNxHd47WU_9u3ofscYCeaYSZBANCUphi8")
				.param("emp_firstname", "askicanan").param("emp_lastname", "employee").param("emp_middle_name", "canan")
				.param("emp_gender", "2").param("emp_birthday", "1990-08-22").param("emp_status", "Employee")
				.param("emp_job_title", "Developer").when()
				.post("http://54.167.125.15/syntaxapi/api/createEmployee.php");
		response.prettyPrint();
		int actualStatusCode = response.getStatusCode();
		Assert.assertEquals("200", actualStatusCode);
	}

}
