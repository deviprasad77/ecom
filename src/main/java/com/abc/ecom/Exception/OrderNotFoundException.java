package com.abc.ecom.Exception;

public class OrderNotFoundException extends RuntimeException{
	public OrderNotFoundException(String msg) { 
		super(msg);
	}

}
