$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Report.feature");
formatter.feature({
  "name": "Report",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@report"
    }
  ]
});
formatter.scenarioOutline({
  "name": "",
  "description": "    : Search for invalid report",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "i enter an invalid \"\u003creportName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "i click search button",
  "keyword": "And "
});
formatter.step({
  "name": "i see No Record Found message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "reportName"
      ]
    },
    {
      "cells": [
        "Kobe Bryant"
      ]
    },
    {
      "cells": [
        "LeBron James"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i am logged into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_am_logged_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i navigated to the Reports Page",
  "keyword": "And "
});
formatter.match({
  "location": "ReportSteps.i_navigated_to_the_Reports_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    : Search for invalid report",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@report"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "i enter an invalid \"Kobe Bryant\"",
  "keyword": "When "
});
formatter.match({
  "location": "ReportSteps.i_enter_an_invalid(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ReportSteps.i_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i see No Record Found message",
  "keyword": "Then "
});
formatter.match({
  "location": "ReportSteps.i_see_No_Record_Found_message()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i am logged into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_am_logged_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i navigated to the Reports Page",
  "keyword": "And "
});
formatter.match({
  "location": "ReportSteps.i_navigated_to_the_Reports_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    : Search for invalid report",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@report"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "i enter an invalid \"LeBron James\"",
  "keyword": "When "
});
formatter.match({
  "location": "ReportSteps.i_enter_an_invalid(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ReportSteps.i_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i see No Record Found message",
  "keyword": "Then "
});
formatter.match({
  "location": "ReportSteps.i_see_No_Record_Found_message()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Search for valid report",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "i enter an valid  \"\u003creportName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "i click search button",
  "keyword": "And "
});
formatter.step({
  "name": "i see the \"\u003creportName\u003e\" report displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "reportName"
      ]
    },
    {
      "cells": [
        "Sample Report"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i am logged into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_am_logged_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i navigated to the Reports Page",
  "keyword": "And "
});
formatter.match({
  "location": "ReportSteps.i_navigated_to_the_Reports_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for valid report",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@report"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "i enter an valid  \"Sample Report\"",
  "keyword": "When "
});
formatter.match({
  "location": "ReportSteps.i_enter_an_valid(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ReportSteps.i_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i see the \"Sample Report\" report displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ReportSteps.i_see_the_report_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/emergencyContact.feature");
formatter.feature({
  "name": "jobDetail",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@JobDetail"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "EmergencyContactSteps.i_am_logged_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "EmergencyContactSteps.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add firstName, middleName and last name",
  "keyword": "And "
});
formatter.match({
  "location": "EmergencyContactSteps.i_add_firstName_middleName_and_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Save button",
  "keyword": "And "
});
formatter.match({
  "location": "EmergencyContactSteps.i_click_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will see Personal Details",
  "keyword": "Then "
});
formatter.match({
  "location": "EmergencyContactSteps.i_will_see_Personal_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding employee emergency contact details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@JobDetail"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I navigate to emergency contact page",
  "keyword": "And "
});
formatter.match({
  "location": "EmergencyContactSteps.i_navigate_to_emergency_contact_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter emergency contact detail",
  "rows": [
    {
      "cells": [
        "Name",
        "Relationship",
        "HomePhoneNumber",
        "MobilePhone",
        "workphone"
      ]
    },
    {
      "cells": [
        "Orhan Pamuk",
        "husband",
        "978-954-45-45",
        "666-666-66-66",
        "777-777-77-77"
      ]
    },
    {
      "cells": [
        "Osman Abali",
        "Brother",
        "978-954-45-48",
        "333-333-33-33",
        "444-444-44-44"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "EmergencyContactSteps.i_enter_emergency_contact_detail(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I confirm saved emergency detail",
  "keyword": "Then "
});
formatter.match({
  "location": "EmergencyContactSteps.i_confirm_saved_emergency_detail()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
});