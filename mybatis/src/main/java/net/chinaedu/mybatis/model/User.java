package net.chinaedu.mybatis.model;

/**
 * Created by chenxuan on 2016/9/28.
 */
public class User {

    private Integer userId;
    private String name;
    private String password;
    private Integer age;


    public User(Integer userId, String name, String password, Integer age) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public User(String name, String password, Integer age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public User() {
    }

    public User(Integer userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
