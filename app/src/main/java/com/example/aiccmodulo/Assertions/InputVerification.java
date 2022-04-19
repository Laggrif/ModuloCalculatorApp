package com.example.aiccmodulo.Assertions;

public class InputVerification {

    private InputVerification(){}

    public static boolean InputIsNotNull(Object input){
        return input.toString() != "";
    }

    public static boolean InputIsNumber(CharSequence input){
        return Long.getLong(input.toString()).getClass() == Long.class;
    }
}
