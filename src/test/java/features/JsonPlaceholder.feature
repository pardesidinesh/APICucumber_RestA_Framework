Feature: Validating Json Placeholder

#  Below Scenario for adding POST HTTP Method Request for Posts and comment endpoint (http://jsonplaceholder.typicode.com/)
#  Two Scenarios (Post and Comment) are covered based on the Examples "EndPoint" and validation of status code

  Scenario Outline: Verify user is able to create post request for json placeholder
    Given Add Json posts Payload with "<title>" "<body>" "<userid>"
    When user calls "<endpoint>" "<id>" with "POST" http request
    Then the API call got success with "<Status_code>"

    Examples:
      | title       | endpoint       | body                                                                       | userid | Status_code | id |
      | RestAssured | JsonPostsAPI   | Testing and validating REST services in Java                               | 11     | 201         |    |
      | Dance       | JsonPostsAPI   | You've gotta dance like there's nobody watching                            | 12     | 201         |    |
      | Life        | JsonPostsAPI   | In three words I can sum up everything I've learned about life: it goes on | 99     | 201         |    |
      | Miracle     | JsonPostsAPI   | There are only two ways to live your life.                                 | 100    | 201         |    |
      | RestAssured | JsonCommentAPI | Testing and validating REST services in Java                               | 22     | 201         |    |
      | Dance       | JsonCommentAPI | You've gotta dance like there's nobody watching                            | 23     | 201         |    |
      | Life        | JsonCommentAPI | In three words I can sum up everything I've learned about life: it goes on | 24     | 201         |    |
      | Miracle     | JsonCommentAPI | There are only two ways to live your life.                                 | 28     | 201         |    |


#  Below scenario is to validation for GET Http method of user details list and other based on the user id.

  Scenario Outline: Verify user is able to create post request for json placeholder
    Given I am on the json placeholder page
    When user calls "GetUsersAPI" "<id>" with "GET" http request
    Then the API call got success with "<Status_code>"

    Examples:
      | id | Status_code |
      |    | 200         |
      | /2 | 200         |
      | /3 | 200         |
      | /4 | 200         |
      | /5 | 200         |


	

	
	
	
	
	
	

	
	
	
