package com.example.sandwish.data.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forgetpasswordresponse {
    @SerializedName("modelState")
    @Expose
    private Integer modelState;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("data")
    @Expose
    private Data data;

    public Integer getModelState() {
        return modelState;
    }

    public void setModelState(Integer modelState) {
        this.modelState = modelState;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
