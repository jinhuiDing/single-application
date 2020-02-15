package entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户角色表(UserRoleRelation)实体类
 *
 * @author makejava
 * @since 2020-02-15 23:59:18
 */
public class UserRoleRelation implements Serializable {
    private static final long serialVersionUID = -17906642571873855L;
    /**
    * 自增ID
    */
    private Integer id;
    /**
    * 用户编码
    */
    private String userId;
    /**
    * 角色编码
    */
    private String roleId;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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

}