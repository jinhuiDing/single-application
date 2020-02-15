package com.gbicc.auth.service;

/**
 * @description: AuthService
 * @author: ding
 * @date: 2020/2/15 22:43
 * @version: 1.0
 */
public interface AuthService {
    String authentication(String username, String password);
}
