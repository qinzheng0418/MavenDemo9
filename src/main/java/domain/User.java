package domain;

import java.io.Serializable;

public class User implements Serializable {

    private String username;
    private String password;

    public User() {
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

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

/*
* MVC：
* model
* view
* controller
* 三层架构:
* web层  Servlet JSP
* service层  组装业务逻辑
* dao 持久层 对数据库进行操作，以及封装数据模型
* 注解：会用
*注册：Ajax JS 异步请求，局部刷新
*
* */