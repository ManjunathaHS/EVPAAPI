Feature: To verify Adding a user, Modify existing user, retrieve user, retrieve users

  Background:
    Given Set the user as the endpoint

  Scenario: Adding a new user with valid values
    When A request is made to add a user by passing valid values
    Then Verify the http status code 201 should be displayed on creating user
    And  Verify details of the user created
    And Also verify the json schema against the response of the user created
    And Get the UserID

  Scenario: Adding a new user with invalid values
    When A request is made to add a  user by passing invalid values
    Then Verify the http status code 400 should be displayed
    And  Verify error message and error code displayed in the response when a request is made to create user by passing invalid values

  Scenario: Updating user details
    When A request is made update user details
    Then Verify the http status code 200 should be displayed on updating user details
    Then Verify the updated fields should be reflected in the response
    And  Also verify the json schema against the response of update user

  Scenario: Retrieve user detail by passing valid user id
    When A request is made to retrieve details of a user by passing valid user id
    Then Verify the http status code 200 should be displayed on retrieving a user details
    And  Also verify the json schema against the response of user details

  Scenario: Retrieve user detail by passing invalid user id
    When Retrieve details of a user by passing invalid user id
    Then Verify the http status code 400 should be displayed when the request is made to fetch details of non existent user
    And  Verify error message and error code displayed in the response when the request is made to fetch details of non existent user

  Scenario: Retrieve all user details
    When Retrieve details of all the users
    Then Verify the http status code 200 should be displayed on retrieving users list
    And  Also verify the json schema against the response of user details