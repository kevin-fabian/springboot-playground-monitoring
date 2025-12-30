package com.fabiankevin.springbootelk;


public class User {
    private String mobile;
    private String email;
    private String name;

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public User(String mobile, String email, String name) {
        this.mobile = mobile;
        this.email = email;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
