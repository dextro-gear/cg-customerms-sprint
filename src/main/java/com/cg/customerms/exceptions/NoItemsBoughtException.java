package com.cg.customerms.exceptions;

public class NoItemsBoughtException extends RuntimeException{
    public NoItemsBoughtException() {
        super("Item hasn't been bought by customer");
    }

    public NoItemsBoughtException(String msg){
        super(msg);
    }
}
