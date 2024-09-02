/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;



public class Swadaqat implements Serializable {
    private static final long serialVersionUID = 8034225775546411584L;
    private static int nextSuggeId = 6000;
    
    private Integer swadaqatId;
    
    private String name;
    private String description;
    private Integer amount;
    
    private User userInfo;

    private Admin adminInfo;

    public Swadaqat() {
        this.swadaqatId = nextSuggeId++;
    }

    public Swadaqat(Integer swadaqatId) {
        this.swadaqatId = swadaqatId;
    }

    public Swadaqat(Integer swadaqatId, String name, String description, Integer amount) {
        this.swadaqatId = swadaqatId;
        this.name = name;
        this.description = description;
        this.amount = amount;
    }

    public static int getNextSuggeId() {
        return nextSuggeId;
    }

    public static void setNextSuggeId(int nextSuggeId) {
        Swadaqat.nextSuggeId = nextSuggeId;
    }

    public Integer getSwadaqatId() {
        return swadaqatId;
    }

    public void setSwadaqatId(Integer swadaqatId) {
        this.swadaqatId = swadaqatId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public User getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(User userInfo) {
        this.userInfo = userInfo;
    }

    public Admin getAdminInfo() {
        return adminInfo;
    }

    public void setAdminInfo(Admin adminInfo) {
        this.adminInfo = adminInfo;
    }

   
    
}
