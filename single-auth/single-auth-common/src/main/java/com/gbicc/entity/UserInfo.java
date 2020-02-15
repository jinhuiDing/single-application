package com.gbicc.entity;

public class UserInfo {

    private Long id;

    private String loginAccount;

    public UserInfo() {
    }

    public UserInfo(Long id, String username) {
        this.id = id;
        this.loginAccount = username;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String username) {

        this.loginAccount = username;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + loginAccount + '\'' +
                '}';
    }
}