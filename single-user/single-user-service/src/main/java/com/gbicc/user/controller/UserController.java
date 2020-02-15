package com.gbicc.user.controller;

import com.gbicc.dto.UserDTO;
import com.gbicc.entity.SysUser;
import com.gbicc.user.service.UserService;
import com.gbicc.vo.ResponseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @description: UserController
 * @author: ding
 * @date: 2020/2/14 17:53
 * @version: 1.0
 */

@RestController
//@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public ResponseVO<UserDTO> login(@RequestParam("username") String username,@RequestParam("password") String password , HttpServletResponse httpServletResponse) {
        SysUser sysUser = this.userService.login(username,password);
        UserDTO dto = new UserDTO();
        BeanUtils.copyProperties(sysUser,dto);
        // 从Header中Authorization返回AccessToken，时间戳为当前时间戳
        return new ResponseVO<UserDTO>(HttpStatus.OK.value(), "登录成功(Login Success.)", dto);
    }

    @PostMapping("register")
    public ResponseVO register(@RequestBody @Valid SysUser user) {
        this.userService.register(user);
        UserDTO dto = new UserDTO();
        BeanUtils.copyProperties(user, dto);
        return new ResponseVO(200,true,"添加成功",dto);
    }


}
