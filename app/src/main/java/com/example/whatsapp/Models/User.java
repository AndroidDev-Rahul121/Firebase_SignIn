package com.example.whatsapp.Models;

public class User {

    public User(String profilepic, String userName, String mail, String password, String userId, String laseMessage) {
        this.profilepic = profilepic;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.laseMessage = laseMessage;
    }

    public User(){}
    //Sign Up constractor

        public User(String userName, String mail, String password) {

            this.userName = userName;
            this.mail = mail;
            this.password = password;

        }

    String profilepic;

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLaseMessage() {
        return laseMessage;
    }

    public void setLaseMessage(String laseMessage) {
        this.laseMessage = laseMessage;
    }

    String userName;
    String mail;
    String password;
    String userId;
    String laseMessage;
}
