package com.gbicc.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色-资源表(RolePermRelation)实体类
 *
 * @author makejava
 * @since 2020-02-15 23:56:52
 */
public class RolePermRelation implements Serializable {
    private static final long serialVersionUID = -25195293602202280L;
    /**
    * 自增ID
    */
    private Integer id;
    /**
    * 角色编码
    */
    private String roleId;
    /**
    * 资源编码
    */
    private String permId;
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

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPermId() {
        return permId;
    }

    public void setPermId(String permId) {
        this.permId = permId;
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