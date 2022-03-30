import entity.Customer;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class ApiServices {

    public static void main(String[] args) {

        ApiServices apiServices = new ApiServices();
        //apiServices.callRestGetServices();
        //apiServices.callRestPostService();
        apiServices.callRestPutService();

   //     apiServices.callRestGetServicesWithQueryParams();
   //     apiServices.getResponseServiceTime();

       // apiServices.GetJsonObjectFromObjet(new Customer());
    }

    public void callRestGetServices(){
      given().when().
                get("https://dog.ceo/api/breeds/image/random")
                .then().log().body();
    }

    public void callRestPostService(){

        String requestBody =  "{\n" +
                "  \"title\": \"foo\",\n" +
                "  \"body\": \"bar\",\n" +
                "  \"userId\": \"1\" \n}";

      Response response =  given().
                header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("https://jsonplaceholder.typicode.com/posts")
                .then().extract().response();
        System.out.println(response.statusCode());



    }

    public void callRestPutService(){

        String requestBody =  "{\n" +
                "  \"title\": \"foo\",\n" +
                "  \"body\": \"baz\",\n" +
                "  \"userId\": \"1\",\n" +
                "  \"id\": \"1\" \n}";

       given().
                header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1")
                .then().assertThat().statusCode(200)
               .log().all();
       ;


    }
    public void callRestDeleteService(){
        Response response =  given().
                header("Content-type", "application/json")
                .when()
                .delete("https://jsonplaceholder.typicode.com/posts/1")
                .then().extract().response();
        System.out.println(response.statusCode());



    }



    public void callRestGetServicesWithQueryParams(){
        given().
                queryParam("CUSTOMER_ID","68195")
                .queryParam("PASSWORD","1234!")
                .queryParam("Account_No","1")
                .when().
                get("http://demo.guru99.com/V4/sinkministatement.php")
                .then().log().body();
    }

    public void getResponseServiceTime(){
        System.out.println(given().
                queryParam("CUSTOMER_ID","68195")
                .queryParam("PASSWORD","1234!")
                .queryParam("Account_No","1")
                .when().
                get("http://demo.guru99.com/V4/sinkministatement.php")
                .timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
    }

    //public void callPostRestWebService(){
    //    given().body()

   // }

    private void GetJsonObjectFromObjet(Customer customer){

        JSONObject jsonObject= new JSONObject(customer);
        System.out.println(jsonObject.toString());

    }
}
