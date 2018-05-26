package shyeang.mybatis.bean;

import shyeang.mybatis.bean.enums.Sex;

import java.io.Serializable;

public class User  implements Serializable{
    private Integer id;
    private String username;
    private String password;
    private Double account;
    private Sex sex;
    
    public User() {
        super();
    }
    
    public User(String username, String password, Double account, String s) {
        super();
        sex = Sex.getSex(s);
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public User(Integer id, String username, String password, Double account, String s) {
        this(username,password,account,s);
        this.id = id;
    }

    @Override
    public java.lang.String toString() {
        return "id:" +id + ";userName:" + username + ";pw:" + password + ";account:" + account + ";sex:" + sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }
}
