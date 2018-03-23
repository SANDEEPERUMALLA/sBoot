package com.psk.sBoot.model;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Person {

    public static void main(String args[]){
        Person p = new Person();
    }

    String firstName;
    String lastName;
    String address;
    int age;

}



