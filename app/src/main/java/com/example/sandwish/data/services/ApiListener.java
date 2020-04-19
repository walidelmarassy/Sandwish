package com.example.sandwish.data.services;


import com.example.sandwish.data.response.ApiResponse;

public interface ApiListener {
    void onLoading();
    void onSuccess(ApiResponse apiResponse);
    void onError();
}
