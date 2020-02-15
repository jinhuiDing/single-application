package com.gbicc.user.service;

import com.gbicc.entity.SysUser;

/**
 * @description: UserService
 * @author: ding
 * @date: 2020/2/14 18:00
 * @version: 1.0
 */
public interface UserService {
    SysUser login(String username,String password);

    boolean register(SysUser user);
}
