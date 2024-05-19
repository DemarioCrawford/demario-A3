package com.coderscampus.A3;

public class Users {
    //instance variables and properties
   private String email;
   private String password;
   private String name;

    //getters and setters for the instance variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//override sytax and tostring
@Override
public String toString() {
    return "Users [email=" + email + ", password=" + password + ", name=" + name + "]";
}

}
