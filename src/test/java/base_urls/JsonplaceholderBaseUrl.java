package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonplaceholderBaseUrl {

    protected RequestSpecification spec;
    //if you use Before annotation at the top of method it will be executed before every test method
    @Before
    public void setUp(){

        spec =  new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();
    }
}
