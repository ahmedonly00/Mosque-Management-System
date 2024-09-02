/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;



public class Admin implements Serializable {
    private static int nextAdminId = 1000;
    

    private Integer adminId;
    
    private String adminName;
    private String adminAddress;
    private String adminPhone;
    private String adminEmail;
    private String password;
    private List<Swadaqat> suggestions;

    public Admin() {
        this.adminId = nextAdminId++;
    }
    
    public Admin(String adminName, String adminAddress, String adminPhone, String adminEmail, String password) {
        this();
        this.adminName = adminName;
        this.adminAddress = adminAddress;
        this.adminPhone = adminPhone;
        this.adminEmail = adminEmail;
        this.password = password;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminAddress() {
        return adminAddress;
    }

    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
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
