package com.gbicc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * @description: UserDTO
 * @author: ding
 * @date: 2020/2/14 17:55
 * @version: 1.0
 */

@Data
public class UserDTO {
    /**
     * 登录名
     */
    private String loginAccount;
    /**
     * 密码
     */
    @JsonIgnore
    private String loginPass;
    /**
     * 用户名（中文）
     */
    private String userName;
    /**
     * 电话
     */
    private String userPhone;
    /**
     * 邮箱
     */
    private String userEmail;
    /**
     * 性别
     */
    private Double userGender;
    /**
     * 生日
     */
    private String userBirthday;
    /**
     * 是否有效（1有效，0 无效）
     */
    private Double userIsvalid;
    /**
     * 部门编码
     */
    private String deptId;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 创建者
     */
    private String cuser;
    /**
     * 盐值
     */
    @JsonIgnore
    private String salt;
    /**
     * 用户类型
     */
    private String yylx;
    /**
     * 企业注册编码
     */
    private String stid;
    /**
     * 更新者
     */
    private String uuser;

    private Date apikeyrefreshtime;
}
