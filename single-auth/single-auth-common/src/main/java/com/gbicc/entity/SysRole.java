package com.gbicc.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色表(SysRole)实体类
 *
 * @author makejava
 * @since 2020-02-15 23:58:35
 */
public class SysRole implements Serializable {
    private static final long serialVersionUID = -18301610045741263L;
    /**
    * 自增ID
    */
    private Integer id;
    /**
    * 角色编码
    */
    private String roleKey;
    /**
    * 角色名称
    */
    private String roleValue;
    /**
    * 备注
    */
    private String roleDesc;
    /**
    * 图标
    */
    private String iconCls;
    /**
    * 排序
    */
    private Double roleOrder;
    /**
    * 是否有效 1 有效 0 无效
    */
    private Double roleIsvalid;
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

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public String getRoleValue() {
        return roleValue;
    }

    public void setRoleValue(String roleValue) {
        this.roleValue = roleValue;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public Double getRoleOrder() {
        return roleOrder;
    }

    public void setRoleOrder(Double roleOrder) {
        this.roleOrder = roleOrder;
    }

    public Double getRoleIsvalid() {
        return roleIsvalid;
    }

    public void setRoleIsvalid(Double roleIsvalid) {
        this.roleIsvalid = roleIsvalid;
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