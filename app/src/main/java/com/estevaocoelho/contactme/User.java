package com.estevaocoelho.contactme;

/**
 * Created by estevaocoelho on 15/02/18.
 */

public class User {

    private String userName;
    private String photoURL;

    public User(String userName, String userImageUrl) {
        this.userName = userName;
        this.photoURL = userImageUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }
}
