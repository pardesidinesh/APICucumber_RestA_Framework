# APIAutomationTest
This is a Rest Assured BDD framework for API test automation. 
Took the approach of BDD along with Rest Assured in order to ensure that the specifications are testable. 
When the features/scenarios are written in Gherkin and glued with step defnitions, 
it provideds an executable one source of truth.

Chosen Cucumber for its rich implementation of the Behavior Driven Development model. 
Integration with Serenity provides both out of the box Rest-Assured methods and an Aggregate report to make sure that the framework is scalable. 
Rest-Assured as an API testing library provides wide array of choices for test developers with both groovy and java libraries. 
Choesn Java to build the framework.
Used the examples to cover most of the scenarios for the Post call and Get call.

# Set UP
Install Java 8
Install Maven 
Add Dependencies in POM
    Maven Plugin
    Maven Cucumber
    Cucumber Java
    Cucumber Junit
    Rest Assured
    
# REST API
In order to test REST APIs, I found REST Assured library so useful:
First, I performed the manual tests using POSTMAN plugin in chrome browser.
This project is aimed to hit the dummy service which returns 201 for post call and 200 for get call. This is written in a feature file using Cucumber.
Each line of the scenario is tied to backend code that actually executes the line (step).

# Steps to start :
Clone / Download the project into your local
Open the Command prompt and navigat to project location
Execute the following Maven command's
Note : you have to point Logging text file path in the file inputstream method.
mvn clean :- To clean the maven repo
mvn install :- To install the maven requirments
mvn test :- To execute the test scenarios
    
