$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/CucumberFeatureFiles/OrderDeclined.feature");
formatter.feature({
  "name": "Invalid order declined",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Ordering product without adding to cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user login to application",
  "keyword": "* "
});
formatter.match({
  "location": "OrderDeclined.user_login_to_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user order product without adding into cart",
  "keyword": "* "
});
formatter.match({
  "location": "OrderDeclined.user_order_product_without_adding_into_cart()"
});
formatter.result({
  "status": "passed"
});
});