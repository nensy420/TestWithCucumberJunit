$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/authorization.feature");
formatter.feature({
  "line": 1,
  "name": "Check invalid authorization",
  "description": "",
  "id": "check-invalid-authorization",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8092059374,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user on AutoRia page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.the_user_on_AutoRia_page()"
});
formatter.result({
  "duration": 143345875,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "The user can\u0027t authorization with invalid data #1",
  "description": "",
  "id": "check-invalid-authorization;the-user-can\u0027t-authorization-with-invalid-data-#1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "The user click on Login in link",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "The user enter in invalid telephone number",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The error message is displayed on the authorization page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theUserClickOnLoginInLink()"
});
formatter.result({
  "duration": 2829069338,
  "status": "passed"
});
formatter.match({
  "location": "Steps.The_user_enter_in_invalid_telephone_number()"
});
formatter.result({
  "duration": 11068285044,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_error_message_is_displayed_on_the_authorization_page()"
});
formatter.result({
  "duration": 20875872,
  "status": "passed"
});
formatter.after({
  "duration": 1160557340,
  "status": "passed"
});
});