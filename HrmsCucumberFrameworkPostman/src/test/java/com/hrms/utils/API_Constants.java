package com.hrms.utils;
public class API_Constants {
	public static final String RESOURCE_URL="http://18.232.148.34/syntaxapi/api";
	
	public static final String CREATE_USER_URL="/createUser.php";
	
	public static final String GENERATE_TOKEN_URL="/generateToken.php";
	
	public static final String GET_ALL_EMPLOYEES_URL="/getAllEmployees.php";
	
	public static final String GET_ONE_EMPLOYEE_URL="/getOneEmployee.php";
	
	public static final String GET_ALL_JOBTITLES_URL="/jobTitle.php";
	
	public static final String GET_ALL_EMPLOYEE_STATUS_URL="employeeStatus.php";
	
	public static final String CREATE_EMPLOYEE_URL="/createEmployee.php";
	
	public static final String UPDATE_EMPLOYEE_URL="/updateEmployee.php";
	
	public static final String DELETE_EMPLOYEE_URL="/deleteEmployee.php";
	
	public static final String CREATE_USER_JSON_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/JSONFiles/createUserBody.json";
	
	public static final String GENERATE_TOKEN_JSON_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/JSONFiles/generateTokenBody.json";
	
	public static final String CREATE_EMPLOYEE_JSON_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/JSONFiles/createEmployeeBody.json";
	
	public static final String UPDATE_EMPLOYEE_JSON_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/JSONFiles/updateEmployeeBody.json";
	
	
}
