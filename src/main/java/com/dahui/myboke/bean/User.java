package com.dahui.myboke.bean;


public class User {

    private String username;
    private String password;
    private Integer id;
    private Long creatatime;
    private Long updatetime;
    private Integer isdel;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCreatatime() {
        return creatatime;
    }

    public void setCreatatime(Long creatatime) {
        this.creatatime = creatatime;
    }

    public Long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}
