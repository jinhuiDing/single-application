package com.gbicc.auth.controller;

import com.gbicc.auth.service.AuthService;
import com.gbicc.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: AuthController
 * @author: ding
 * @date: 2020/2/15 22:41
 * @version: 1.0
 */

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/accredit")
    public ResponseVO<String> authentication(@RequestParam("username") String username, @RequestParam("password") String password) {
        String token = authService.authentication(username, password);
        return new ResponseVO<String>(HttpStatus.OK.value(), "登录成功(Login Success.)", token);
    }


    @GetMapping("demo")
    public ResponseVO<String> dem(){
        return new ResponseVO<String>(HttpStatus.OK.value(),"成功","demo");
    }

}
