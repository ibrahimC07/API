package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class RestfulBaseUrl {

    protected RequestSpecification spec;
    //if you use Before annotation at the top of method it will be executed before every test method
    @Before
    public void setUp(){

        spec =  new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build();
    }
}
