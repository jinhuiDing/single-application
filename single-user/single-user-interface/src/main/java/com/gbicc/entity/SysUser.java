package com.gbicc.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(SysUser)实体类
 *
 * @author makejava
 * @since 2020-02-14 17:42:38
 */

@Data
public class SysUser implements Serializable {
    private static final long serialVersionUID = 308656069607394769L;
    /**
    * 自增ID
    */
    private Integer id;
    /**
    * 登录名
    */
    private String loginAccount;
    /**
    * 密码
    */
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