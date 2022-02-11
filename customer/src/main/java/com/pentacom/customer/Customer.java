package com.pentacom.customer;

//creating the model for our customer microservice

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

}
