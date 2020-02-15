package com.gbicc.user.service.impl;

import com.gbicc.entity.SysUser;
import com.gbicc.exception.CustomUnauthorizedException;
import com.gbicc.user.mapper.SysUserMapper;
import com.gbicc.user.service.UserService;
import com.gbicc.utils.CodecUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: UserServiceImpl
 * @author: ding
 * @date: 2020/2/14 18:00
 * @version: 1.0
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser login(String username, String password) {
        SysUser queryUser = new SysUser();
        queryUser.setLoginAccount(username);
        queryUser = this.sysUserMapper.selectOne(queryUser);
        if (queryUser == null) {
            throw new CustomUnauthorizedException("帐号或密码错误(Account or Password Error.)");
        }
        String queryUserPassword = queryUser.getLoginPass();
        String newPassword = CodecUtils.md5Hex(password, queryUser.getSalt());
        if (queryUserPassword.equals(newPassword)) {
            return queryUser;
        } else {
            return null;
        }

    }

    @Override
    public boolean register(SysUser user) {
        user.setSalt(CodecUtils.generateSalt());
        user.setLoginPass(CodecUtils.md5Hex(user.getLoginPass(), user.getSalt()));
        return this.sysUserMapper.insertSelective(user) != 0;
    }
}
