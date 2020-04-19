package com.example.sandwish.data.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisterBody {
    @SerializedName("userName")
    @Expose
    private String userName;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("cityId")
    @Expose
    private Integer cityId;
    @SerializedName("districtId")
    @Expose
    private Integer districtId;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("mobToken")
    @Expose
    private String mobToken;
    @SerializedName("mobType")
    @Expose
    private String mobType;
    @SerializedName("lang")
    @Expose
    private String lang;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobToken() {
        return mobToken;
    }

    public void setMobToken(String mobToken) {
        this.mobToken = mobToken;
    }

    public String getMobType() {
        return mobType;
    }

    public void setMobType(String mobType) {
        this.mobType = mobType;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
