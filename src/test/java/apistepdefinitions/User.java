package apistepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

/**
 * @author jayaprakashs on 9/22/2018
 */
public class User {

    private RequestSpecification spec;
    private Response             response;

    @Given( "^Set the user as the endpoint$" )
    public RequestSpecification setTheUserAsTheEndpoint ( ) throws Throwable {
        return  spec = BaseClass.SpecificationBuilder ( );

    }

    @When( "^A request is made to retrieve details of a user by passing valid user id$" )
    public void aRequestIsMadeToRetrieveDetailsOfAUserByPassingValidUserId ( ) throws Throwable {
        response = given ( ).spec ( spec ).auth ( ).preemptive ( ).oauth2 ( BaseClass.token ).when ( ).get ( "/manjunatha.s@harman.com" );
    }

    @Then( "^Verify the http status code (\\d+) should be displayed on retrieving a user details$" )
    public void verifyTheHttpStatusCodeShouldBeDisplayedOnRetrievingAUserDetails ( int expectedHttpStatusCode ) throws Throwable {
        response.then ( ).assertThat ( ).statusCode ( expectedHttpStatusCode );

    }

    @And( "^Also verify the json schema against the response of user details$" )
    public void alsoVerifyTheJsonSchemaAgainstTheResponseOfUserDetails ( ) throws Throwable {
        response.then ( ).assertThat ( ).body ( matchesJsonSchemaInClasspath ( "JSONFiles/User.json" ) );

    }

    @When( "^Retrieve details of all the users$" )
    public void retrieveDetailsOfAllTheUsers ( ) throws Throwable {
        response = given ( ).spec ( spec ).auth ( ).preemptive ( ).oauth2 ( BaseClass.token ).when ( ).get ( "/users" );

    }

    @Then( "^Verify the http status code (\\d+) should be displayed on retrieving users list$" )
    public void verifyTheHttpStatusCodeShouldBeDisplayedOnRetrievingUsersList ( int expectedHttpStatusCode ) throws Throwable {
        response.then ( ).assertThat ( ).statusCode ( expectedHttpStatusCode );

    }

    @When( "^Retrieve details of a user by passing invalid user id$" )
    public void retrieveDetailsOfAUserByPassingInvalidUserId ( ) throws Throwable {
        response = given ( ).spec ( spec ).auth ( ).preemptive ( ).oauth2 ( BaseClass.token ).when ( ).get ( "/jayaprakash.s@harman.co.in" );
    }

    @Then( "^Verify the http status code (\\d+) should be displayed when the request is made to fetch details of non existent user$" )
    public void verifyTheHttpStatusCodeShouldBeDisplayedWhenTheRequestIsMadeToFetchDetailsOfNonExistentUser ( int expectedHttpStatusCode ) throws Throwable {
        response.then ( ).assertThat ( ).statusCode ( expectedHttpStatusCode );
    }

    @And( "^Verify error message and error code displayed in the response when the request is made to fetch details of non existent user$" )
    public void verifyErrorMessageAndErrorCodeDisplayedInTheResponseWhenTheRequestIsMadeToFetchDetailsOfNonExistentUser ( ) throws Throwable {

    }
}
