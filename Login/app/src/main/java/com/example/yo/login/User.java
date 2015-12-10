package com.example.yo.login;

/**
 * Created by yo on 12/11/2015.
 */
public class User {
    private String user="";
    private String pass="";

    public User(String userr, String passs){
        this.user = userr;
        this.pass = passs;
    }

    public User() {

    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
