package apistepdefinitions;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.specification.RequestSpecification;



/**
 * @author jayaprakashs on 9/5/2018
 */
public class BaseClass {

    private static final String host   = "http://hcsfabricqan.southcentralus.cloudapp.azure.com:8892/api/v1/";
    private static final String tenantId="c4bfbc112aec45f5a8ab3136df1972fa";
    public static  final String token="eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ilg1ZVhrNHh5b2pORnVtMWtsMll0djhkbE5QNC1jNTdkTzZRR1RWQndhTmsifQ.eyJleHAiOjE1Mzc3NzA1ODAsIm5iZiI6MTUzNzc2Njk4MCwidmVyIjoiMS4wIiwiaXNzIjoiaHR0cHM6Ly9sb2dpbi5taWNyb3NvZnRvbmxpbmUuY29tLzYzNGIzMzM5LTlkOGUtNDc2ZS1iN2QwLTI0YmI2NmFiNDk0Yy8iLCJzdWIiOiJhNTk0Y2Y5ZC1mNWQzLTQyZTgtYTA5Yy0zY2E3ZTgyMTBiNmYiLCJhdWQiOiJiYjE5ZTRhZS0zYmI1LTQxZjUtOWIwZi1kYjYwMjBiZDc3M2YiLCJub25jZSI6IjllMDEwYTdiLWY2NTUtNDZkYS04NWY0LWQ0MzZkMTczYWNlYyIsImlhdCI6MTUzNzc2Njk4MCwiYXV0aF90aW1lIjoxNTM3NzY2OTgwLCJleHRlbnNpb25fUm9sZSI6IlByb3BlcnR5IEFkbWluIiwibmFtZSI6Ik1hbmp1bmF0aGEgIEhTIiwiZW1haWxzIjpbIm1hbmp1bmF0aGEuc0BoYXJtYW4uY29tIl0sInRmcCI6IkIyQ18xX0hDU19TaWduSW5VcFBvbGljeSJ9.UxbQfCDsrkVtTPnTtngyD5nV91m5XfsZ9xkhrvuhTjkcu4-W1T_0YqFikzxnTUlFJJ1n84KMlomipiaRRNyyxPEWKpqTA3fvBqLG9EnSI7xA4v5Z2KFJmu53GIYyyy5yftQo9N4DcMwjYkzpDqyfmcuK23hM8hjxdZ2N90vPEo-zScknSMJZSkt1xBltI4odPyxwW028kYoFgSbEHByk4XqFFSKq0APnMKG_NyeLH7v-Z1wwpEeX49bPZHqID6zC-Yd4tAYl0CxrWzka8dcLYklakqY6_T3otWh7QFrlABnORr3OExwxTSBRckKgsoVOaW0jVnD4-hPFaw9IKCM_Xg";



    public static RequestSpecification SpecificationBuilder ( ) throws Throwable {

        RestAssuredConfig  restAssuredConfig = new RestAssuredConfig ( );
        RequestSpecBuilder builder           = new RequestSpecBuilder ( );
              builder.setBaseUri ( host ).setAccept ( "application/json" )
                .addQueryParam ( "x-harman-tenantId" ,tenantId);
        return builder.build ( );
    }


}
