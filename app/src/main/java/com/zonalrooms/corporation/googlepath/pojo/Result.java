package com.zonalrooms.corporation.googlepath.pojo;

import com.google.gson.annotations.SerializedName;

//package com.zonalrooms.corporation.retrofit;
import com.google.gson.annotations.Expose;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("result")
    @Expose
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}

