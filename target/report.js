$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/addtriff.feature");
formatter.feature({
  "name": "To Check AbI BUS Booking",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User entering in to Abi Bus URL",
  "keyword": "Given "
});
formatter.step({
  "name": "Fills source and destination \"\u003csource\u003e\",\"\u003cDestination\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click the Search",
  "keyword": "And "
});
formatter.step({
  "name": "validate the details",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "source",
        "Destination"
      ]
    },
    {
      "cells": [
        "Chennai",
        "Bangalore"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User entering in to Abi Bus URL",
  "keyword": "Given "
});
formatter.match({
  "location": "homepage.user_entering_in_to_Abi_Bus_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fills source and destination \"Chennai\",\"Bangalore\"",
  "keyword": "When "
});
formatter.match({
  "location": "Fillthedetailspage.fills_source_and_destination(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Search",
  "keyword": "And "
});
formatter.match({
  "location": "SearchBus.click_the_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the details",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidationPage.validate_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});