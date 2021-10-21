package entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Customer {

    public String firstName;
    public String lastName;
    public String userName;
    public String password;
    public String email;


//    public  Customer getCustomer (){
//      return   Customer.builder()
//                .firstName("Cristian")
//                .lastName("Mira")
//                .userName("Cmirap")
//                .password("1123**")
//                .email("cmira@example.com").build();
//    }

}
