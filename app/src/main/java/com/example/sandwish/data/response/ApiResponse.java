package com.example.sandwish.data.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ApiResponse {
    public final Status status;

    @Nullable
    public final Object data;

    @Nullable
    public final Throwable error;

    public ApiResponse(Status status, Object data, Throwable error){
        this.status = status;
        this.data = data;
        this.error = error;
    }

    public static ApiResponse loading(){
        return new ApiResponse(Status.LOADING, null, null);
    }

    public static ApiResponse success(@NonNull Object data) {
        return new ApiResponse(Status.SUCCESS, data, null);
    }

    public static ApiResponse error(@NonNull Throwable error) {
        return new ApiResponse(Status.ERROR, null, error);
    }
}
