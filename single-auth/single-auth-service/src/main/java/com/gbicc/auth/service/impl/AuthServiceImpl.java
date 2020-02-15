package com.gbicc.auth.service.impl;

import com.gbicc.auth.client.UserClient;
import com.gbicc.auth.service.AuthService;
import com.gbicc.dto.UserDTO;
import com.gbicc.entity.UserInfo;
import com.gbicc.utils.JwtUtil;
import com.gbicc.vo.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: AuthServiceImpl
 * @author: ding
 * @date: 2020/2/15 22:44
 * @version: 1.0
 */

@Service
public class AuthServiceImpl implements AuthService {

    private Logger logger = LoggerFactory.getLogger(AuthServiceImpl.class);
    @Autowired
    private UserClient userClient;

    public String authentication(String username, String password) {
        try {
            ResponseVO response = userClient.login(username, password);
            UserDTO user = (UserDTO) response.getData();
            //登陆成功
            if (null != user) {
                UserInfo userInfo = new UserInfo();
                BeanUtils.copyProperties(user, userInfo);
                String token = JwtUtil.sign(username, String.valueOf(System.currentTimeMillis()));
                return token;
            } else {
                logger.info("用户信息不存在，{}", username);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
