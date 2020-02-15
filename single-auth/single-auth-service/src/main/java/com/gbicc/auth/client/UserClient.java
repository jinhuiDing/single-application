package com.gbicc.auth.client;

import com.gbicc.dto.UserDTO;
import com.gbicc.vo.ResponseVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: UserClient
 * @author: ding
 * @date: 2020/2/15 22:45
 * @version: 1.0
 */
@FeignClient("single-user-service")
public interface UserClient {

    @PostMapping("/login")
    public ResponseVO<UserDTO> login(@RequestParam("username") String username, @RequestParam("password") String password);
}