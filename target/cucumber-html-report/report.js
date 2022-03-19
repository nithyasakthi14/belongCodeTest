$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MegaMenu.feature");
formatter.feature({
  "line": 1,
  "name": "Mega menu validation",
  "description": "",
  "id": "mega-menu-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1949021611,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Mega menu is accessible",
  "description": "",
  "id": "mega-menu-validation;validate-mega-menu-is-accessible",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Automation practice application is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user checks megamenu is displayed and clickable",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user select dresses",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user navigates to summerDresses menu",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user should be in summerDresses page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify the page title",
  "rows": [
    {
      "cells": [
        "pageTitle"
      ],
      "line": 10
    },
    {
      "cells": [
        "Summer Dresses"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDef.automation_practice_application_is_opened()"
});
formatter.result({
  "duration": 6282141538,
  "status": "passed"
});
formatter.match({
  "location": "MegaMenuStepDef.userChecksMegamenuIsDisplayedAndClickable()"
});
formatter.result({
  "duration": 71721234,
  "status": "passed"
});
formatter.match({
  "location": "MegaMenuStepDef.user_select_dresses()"
});
formatter.result({
  "duration": 3203891570,
  "status": "passed"
});
formatter.match({
  "location": "MegaMenuStepDef.user_navigates_to_summerDresses_menu()"
});
formatter.result({
  "duration": 2109805778,
  "status": "passed"
});
formatter.match({
  "location": "MegaMenuStepDef.userShouldBeInSummerDressesPage()"
});
formatter.result({
  "duration": 22064147,
  "status": "passed"
});
formatter.match({
  "location": "MegaMenuStepDef.verify_the_page_title(DataTable)"
});
formatter.result({
  "duration": 13763256,
  "status": "passed"
});
formatter.after({
  "duration": 83553149,
  "status": "passed"
});
formatter.uri("Register.feature");
formatter.feature({
  "line": 1,
  "name": "Registering to automation practice",
  "description": "",
  "id": "registering-to-automation-practice",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1411602675,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validate user is able to register",
  "description": "",
  "id": "registering-to-automation-practice;validate-user-is-able-to-register",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Automation practice application is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click sign in",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I create account with emailid \"testRandom@testauto.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be able to register with my below details",
  "rows": [
    {
      "cells": [
        "Gender",
        "FirstName",
        "LastName",
        "Password",
        "Address",
        "City",
        "State",
        "Zip",
        "Mobile"
      ],
      "line": 8
    },
    {
      "cells": [
        "Mr",
        "TestFName",
        "TestLName",
        "Password1",
        "100 Spencer Street",
        "Anchorage",
        "Alaska",
        "30000",
        "0406345454"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDef.automation_practice_application_is_opened()"
});
formatter.result({
  "duration": 6485238916,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.i_click_sign_in()"
});
formatter.result({
  "duration": 2077624295,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testRandom@testauto.com",
      "offset": 31
    }
  ],
  "location": "RegisterStepDef.i_create_account_with_emailid(String)"
});
formatter.result({
  "duration": 5177044582,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.i_should_be_able_to_register_with_my_below_details(DataTable)"
});
formatter.result({
  "duration": 8243779069,
  "status": "passed"
});
formatter.after({
  "duration": 78761136,
  "status": "passed"
});
formatter.before({
  "duration": 1286381546,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Validate incorrect email error message",
  "description": "",
  "id": "registering-to-automation-practice;validate-incorrect-email-error-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "Automation practice application is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click sign in",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I create account with emailid \"testRandom@testauto\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should get invalid email error message",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I should be able to see error message displayed",
  "rows": [
    {
      "cells": [
        "errorMessage"
      ],
      "line": 17
    },
    {
      "cells": [
        "Invalid email address."
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDef.automation_practice_application_is_opened()"
});
formatter.result({
  "duration": 6221989995,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.i_click_sign_in()"
});
formatter.result({
  "duration": 4365161469,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testRandom@testauto",
      "offset": 31
    }
  ],
  "location": "RegisterStepDef.i_create_account_with_emailid(String)"
});
formatter.result({
  "duration": 5160583028,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.iShouldGetInvalidEmailErrorMessage()"
});
formatter.result({
  "duration": 35692244,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.iShouldBeAbleToSeeErrorMessageDisplayed(DataTable)"
});
formatter.result({
  "duration": 2488703,
  "status": "passed"
});
formatter.after({
  "duration": 74695364,
  "status": "passed"
});
});