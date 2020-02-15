package com.gbicc.exception;

/**
 * @description: CustomUnauthorizedException
 * @author: ding
 * @date: 2020/2/14 18:03
 * @version: 1.0
 */


public class CustomUnauthorizedException extends RuntimeException {
    public CustomUnauthorizedException(String s) {
        super(s);
    }
}
