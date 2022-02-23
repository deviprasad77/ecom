package com.abc.ecom.Exception;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String msg) {
    	super(msg);
    }
}
