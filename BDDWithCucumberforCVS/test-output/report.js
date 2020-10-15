$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MinuteClinic.feature");
formatter.feature({
  "line": 1,
  "name": "User should be able to find the nearby Minute Clinic with the help of zipcode.",
  "description": "",
  "id": "user-should-be-able-to-find-the-nearby-minute-clinic-with-the-help-of-zipcode.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User should be able to find the nearby Minute Clinic.",
  "description": "",
  "id": "user-should-be-able-to-find-the-nearby-minute-clinic-with-the-help-of-zipcode.;user-should-be-able-to-find-the-nearby-minute-clinic.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on the cvs pharmacy minute clinic page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters their \"\u003czipcode\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be able to get the locations of the minute clinic within his zip code.",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "user-should-be-able-to-find-the-nearby-minute-clinic-with-the-help-of-zipcode.;user-should-be-able-to-find-the-nearby-minute-clinic.;",
  "rows": [
    {
      "cells": [
        "zipcode"
      ],
      "line": 10,
      "id": "user-should-be-able-to-find-the-nearby-minute-clinic-with-the-help-of-zipcode.;user-should-be-able-to-find-the-nearby-minute-clinic.;;1"
    },
    {
      "cells": [
        "76210"
      ],
      "line": 11,
      "id": "user-should-be-able-to-find-the-nearby-minute-clinic-with-the-help-of-zipcode.;user-should-be-able-to-find-the-nearby-minute-clinic.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6704241800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should be able to find the nearby Minute Clinic.",
  "description": "",
  "id": "user-should-be-able-to-find-the-nearby-minute-clinic-with-the-help-of-zipcode.;user-should-be-able-to-find-the-nearby-minute-clinic.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on the cvs pharmacy minute clinic page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters their \"76210\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be able to get the locations of the minute clinic within his zip code.",
  "keyword": "Then "
});
formatter.match({
  "location": "FindaClinic.user_is_already_on_the_cvs_pharmacy_minute_clinic_page()"
});
formatter.result({
  "duration": 3594548400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "76210",
      "offset": 19
    }
  ],
  "location": "FindaClinic.user_enters_their(String)"
});
formatter.result({
  "duration": 2544994300,
  "status": "passed"
});
formatter.match({
  "location": "FindaClinic.user_should_be_able_to_get_the_locations_of_the_minute_clinic_within_his_zip_code()"
});
formatter.result({
  "duration": 3163826400,
  "status": "passed"
});
formatter.after({
  "duration": 15600,
  "status": "passed"
});
});