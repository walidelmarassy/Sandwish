package com.example.sandwish.utils;


import com.example.sandwish.data.response.ApiResponse;
import com.example.sandwish.data.services.ApiListener;

public class ApiUtils {
    public static void consumeResponse(ApiResponse apiResponse, ApiListener apiListener){
        switch (apiResponse.status){
            case LOADING:
                apiListener.onLoading();
                break;

            case SUCCESS:
                apiListener.onSuccess(apiResponse);
                break;

            case ERROR:
                apiListener.onError();
                break;
        }
    }
}
