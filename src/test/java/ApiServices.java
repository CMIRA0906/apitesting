import entity.Customer;
import org.json.JSONObject;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class ApiServices {

    public static void main(String[] args) {

        ApiServices apiServices = new ApiServices();
        apiServices.callRestGetServices();
        apiServices.callRestGetServicesWithQueryParams();
        apiServices.getResponseServiceTime();

       // apiServices.GetJsonObjectFromObjet(new Customer());
    }

    public void callRestGetServices(){
        given().when().
                get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1")
                .then().log().all();
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
