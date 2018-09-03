Feature: Verify Adding a new  Brand, Modifying existing Brand, Get Brand details by ID, Get list of Brands, Get wakeword of a Brand, delete a Brand

  Background:
    Given Set the brands as the endpoint

  Scenario: Adding a new brand with valid values
    When User makes request to add a brand passing valid values
    Then Verify the http status code 201 should be displayed on adding a brand
    And  Verify details of the brand added
    And Also verify the json schema against the response of the brand added
    And  Get the BrandID

  Scenario: Adding a new brand with an existing brandname(Belonging to different BrandID)
    When User makes request to add a brand passing valid values and existing brandname
    Then Verify the http status code 400 should be displayed when user tries to add a brand
    And  Verify the error code and the message displayed in the response when user tries to add duplicate brandname

  Scenario: Modify a brand name,chain names
    When User makes a request to modify brandname, chain names by passing valid Brand ID
    Then Verify the http status code 200 should be displayed when user modifies brandname and chain name
    And  Verify the updated brandname and chain names are reflected in the response

  Scenario: Modify a brand name,chain names by passing invalid Brand ID
    When User makes a request to modify brandname, chain names by invalid Brand ID
    Then Verify the http status code 400 should be displayed when user modifies brandname by passing invalid BrandID
    And  Verify the error code and the message displayed in the response on passing invalid BrandID

  Scenario: Modify a brand name to an existing BrandName(Belonging to different BrandID), chain names by passing valid Brand ID
    When User makes a request to modify brandname to an existing Brandname by passing valid Brand ID
    Then Verify the http status code 200 should be displayed when user modifies brandname and chain name
    And  Verify the error code and the message displayed in the response when user tries to modify brand name by duplicating it

  Scenario: Retrieve brand details by passing  valid BrandID
    When User makes a request to retrieve details of a Brand by passing BrandID
    Then Verify the http status code 200 should be displayed on retrieving a brand details
    And  Also verify the json schema against the response of brand details
    And Verify the BrandID exists in the response

  Scenario: Retrieve brand details by passing  invalid BrandID
    When A request is made to retrieve details of a Brand by passing invalid BrandID
    Then Verify the http status code 400 should be displayed on retrieving a brand details
    And  Verify the error code and the message displayed in the response on passing invalid BrandID

  Scenario: Retrieve list of brands
    When A request is made to retrieve list of brands
    Then Verify the http status code 200 should be displayed on retrieving list of brands
    And  Also verify the json schema against the response of brand details
    And Verify the BrandID exists in the response

  Scenario: Get wakewords of a brand
    When A request is made to get the wakewords of a Brand by passing BrandID
    Then Verify the http status code 200 should be displayed on retrieving list of brands
    And Verify the wakeword is displayed in the response

  Scenario: Delete a brand
    When User makes a request to delete a by passing BrandID
    Then Verify the http status code 200 should be displayed on deleting a brand

  Scenario: Delete a brand a non existing brand
    When User makes a request to delete a by passing BrandID
    Then Verify the http status code 404 should be displayed on deleting non-existing brand
