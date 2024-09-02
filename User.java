/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;



public class User implements Serializable {
    private static final long serialVersionUID = 3722913703470768044L;
    private static int nextUserId = 2000;
    
    private Integer userId;
    
    private String userName;
    private String userAddress;
    private String userPhone;
    private String userEmail;
    private String password;
    
    private List<Swadaqat> suggestions;

    public User() {
        this.userId = nextUserId++;
    }
    
    public User(String userName, String userAddress, String userPhone, String userEmail, String password) {
        this();
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Swadaqat> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<Swadaqat> suggestions) {
        this.suggestions = suggestions;
    }
}
