import spock.lang.Specification
import static io.restassured.RestAssured.given

class SecondDemo extends Specification{
    def "should get user details by user name successfully"(){
        given:"no given"
        when:"call get user by name api"
        given().baseUri("http://localhost:9090/")
        .when()
        .pathParam("bookName",bookName)
        .get("api/getBook/{bookName}")
        .then()
        .assertThat().statusCode(200)
        then:"no then"
        where:
        bookName|placeHolder
        "tom"|""
        "dave"|""
    }
}
