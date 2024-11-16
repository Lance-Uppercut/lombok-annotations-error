package com.example.lombok_annotations_error;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person {
    private String firstName;
    private String lastName;
}
