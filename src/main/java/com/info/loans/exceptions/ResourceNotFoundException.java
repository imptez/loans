package com.info.loans.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message){
        super(message);
    }


    public ResourceNotFoundException(String feild1, String Feild2, String Filed3) {

    }
}
