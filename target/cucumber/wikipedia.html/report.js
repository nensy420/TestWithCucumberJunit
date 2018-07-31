$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authorization.feature");
formatter.feature({
  "line": 1,
  "name": "Check invalid authorization",
  "description": "",
  "id": "check-invalid-authorization",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2248615,
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
  "location": "Steps.theUserOnAutoRiaPage()"
});
formatter.result({
  "duration": 8864285184,
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
  "name": "The user enter in invalid telephone \u003d \"032679\" number",
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
  "duration": 2434788745,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "032679",
      "offset": 39
    }
  ],
  "location": "Steps.theUserEnterInInvalidTelephoneNumber(String)"
});
formatter.result({
  "duration": 11109585186,
  "status": "passed"
});
formatter.match({
  "location": "Steps.theErrorMessageIsDisplayedOnTheAuthorizationPage()"
});
formatter.result({
  "duration": 36503779,
  "status": "passed"
});
formatter.after({
  "duration": 1199716431,
  "status": "passed"
});
formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search verification",
  "description": "",
  "id": "search-verification",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "The search results correspond to the specified parameters",
  "description": "",
  "id": "search-verification;the-search-results-correspond-to-the-specified-parameters",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "The user on AutoRia page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "The user enters the \"\u003ccar brand\u003e\",\"\u003cregion\u003e\" in the search form",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "The user clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "The user sees that results of search match the specified search parameters \"\u003cregion\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "search-verification;the-search-results-correspond-to-the-specified-parameters;",
  "rows": [
    {
      "cells": [
        "car brand",
        "region"
      ],
      "line": 8,
      "id": "search-verification;the-search-results-correspond-to-the-specified-parameters;;1"
    },
    {
      "cells": [
        "Audi",
        "Киев"
      ],
      "line": 9,
      "id": "search-verification;the-search-results-correspond-to-the-specified-parameters;;2"
    },
    {
      "cells": [
        "BMW",
        "Винница"
      ],
      "line": 10,
      "id": "search-verification;the-search-results-correspond-to-the-specified-parameters;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 29948,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "The search results correspond to the specified parameters",
  "description": "",
  "id": "search-verification;the-search-results-correspond-to-the-specified-parameters;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "The user on AutoRia page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "The user enters the \"Audi\",\"Киев\" in the search form",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "The user clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "The user sees that results of search match the specified search parameters \"Киев\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theUserOnAutoRiaPage()"
});
formatter.result({
  "duration": 8336527451,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Audi",
      "offset": 21
    },
    {
      "val": "Киев",
      "offset": 28
    }
  ],
  "location": "Steps.theUserEntersTheCarBrandRegionInTheSearchForm(String,String)"
});
formatter.result({
  "duration": 1545783571,
  "status": "passed"
});
formatter.match({
  "location": "Steps.theUserClicksOnSearchButton()"
});
formatter.result({
  "duration": 2994981336,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Киев",
      "offset": 76
    }
  ],
  "location": "Steps.theUserSeesThatResultsOfSearchMatchTheSpecifiedSearchParameters(String)"
});
formatter.result({
  "duration": 10040992803,
  "status": "passed"
});
formatter.after({
  "duration": 1369516977,
  "status": "passed"
});
formatter.before({
  "duration": 29949,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "The search results correspond to the specified parameters",
  "description": "",
  "id": "search-verification;the-search-results-correspond-to-the-specified-parameters;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "The user on AutoRia page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "The user enters the \"BMW\",\"Винница\" in the search form",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "The user clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "The user sees that results of search match the specified search parameters \"Винница\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.theUserOnAutoRiaPage()"
});
formatter.result({
  "duration": 7539924702,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 21
    },
    {
      "val": "Винница",
      "offset": 27
    }
  ],
  "location": "Steps.theUserEntersTheCarBrandRegionInTheSearchForm(String,String)"
});
formatter.result({
  "duration": 1485388109,
  "status": "passed"
});
formatter.match({
  "location": "Steps.theUserClicksOnSearchButton()"
});
formatter.result({
  "duration": 3169645058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Винница",
      "offset": 76
    }
  ],
  "location": "Steps.theUserSeesThatResultsOfSearchMatchTheSpecifiedSearchParameters(String)"
});
formatter.result({
  "duration": 10038500086,
  "status": "passed"
});
formatter.after({
  "duration": 1310278437,
  "status": "passed"
});
});