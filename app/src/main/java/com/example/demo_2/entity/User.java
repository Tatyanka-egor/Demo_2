package com.example.demo_2.entity;

public class User {
    private static final String email="email";

    // "email": "vasya@mail.com",
          //   "password": "qwerty",
            // "firstName": "John",
           //  "lastName": "Johnson"

    public static final String EMAIL="email";
    public static final String PASSWORD="password";


    public static User getCurrentUser() {
        if(CurrentUser!=null)
            CurrentUser=new User();
        return CurrentUser;
    }

    public static void setCurrentUser(User currentUser) {
        CurrentUser = currentUser;
    }

    private static User CurrentUser;

    public long getToken() {
        return token;
    }

    public void setToken(long token) {
        this.token = token;
    }

    private long token;
}
