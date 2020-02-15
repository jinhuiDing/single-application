package com.gbicc.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 资源表(SysPermission)实体类
 *
 * @author makejava
 * @since 2020-02-15 23:57:34
 */
public class SysPermission implements Serializable {
    private static final long serialVersionUID = -84328493605867091L;
    /**
    * 自增ID
    */
    private Integer id;
    /**
    * 资源路径
    */
    private String dataUrl;
    /**
    * 资源编码
    */
    private String menuKey;
    /**
    * 资源名称
    */
    private String menuVal;
    /**
    * 资源类型N-后台节点 B后台按钮 M后台菜单 FN前台节点 FB前台按钮 FM前台菜单
    */
    private String menuType;
    /**
    * 图标
    */
    private String iconCls;
    /**
    * 上级资源
    */
    private String menuPkey;
    /**
    * 排序
    */
    private Double menuOrder;
    /**
    * 有效状态 1 有效 0 无效
    */
    private Double menuIsvalid;
    /**
    * 资源描述
    */
    private String menuDesc;
    /**
    * 创建时间
    */
    private Date createdTime;
    /**
    * 更新时间
    */
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }

    public String getMenuKey() {
        return menuKey;
    }

    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey;
    }

    public String getMenuVal() {
        return menuVal;
    }

    public void setMenuVal(String menuVal) {
        this.menuVal = menuVal;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getMenuPkey() {
        return menuPkey;
    }

    public void setMenuPkey(String menuPkey) {
        this.menuPkey = menuPkey;
    }

    public Double getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Double menuOrder) {
        this.menuOrder = menuOrder;
    }

    public Double getMenuIsvalid() {
        return menuIsvalid;
    }

    public void setMenuIsvalid(Double menuIsvalid) {
        this.menuIsvalid = menuIsvalid;
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
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

}