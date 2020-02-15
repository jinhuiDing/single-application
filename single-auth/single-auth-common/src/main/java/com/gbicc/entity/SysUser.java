package entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(SysUser)实体类
 *
 * @author makejava
 * @since 2020-02-15 23:59:05
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = -18861899805591919L;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Double getUserGender() {
        return userGender;
    }

    public void setUserGender(Double userGender) {
        this.userGender = userGender;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Double getUserIsvalid() {
        return userIsvalid;
    }

    public void setUserIsvalid(Double userIsvalid) {
        this.userIsvalid = userIsvalid;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getYylx() {
        return yylx;
    }

    public void setYylx(String yylx) {
        this.yylx = yylx;
    }

    public String getStid() {
        return stid;
    }

    public void setStid(String stid) {
        this.stid = stid;
    }

    public String getUuser() {
        return uuser;
    }

    public void setUuser(String uuser) {
        this.uuser = uuser;
    }

    public Date getApikeyrefreshtime() {
        return apikeyrefreshtime;
    }

    public void setApikeyrefreshtime(Date apikeyrefreshtime) {
        this.apikeyrefreshtime = apikeyrefreshtime;
    }

}