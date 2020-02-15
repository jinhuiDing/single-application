package com.gbicc.exception;

/**
 * @description: CustomException
 * @author: ding
 * @date: 2020/2/15 22:59
 * @version: 1.0
 */


public class CustomException extends RuntimeException {
    public CustomException(String msg) {
        super(msg);
    }
}
