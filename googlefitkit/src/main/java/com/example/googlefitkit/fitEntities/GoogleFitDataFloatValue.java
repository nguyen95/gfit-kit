package com.example.googlefitkit.fitEntities;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GoogleFitDataFloatValue implements Serializable {
    @SerializedName("date")
    private String date;
    @SerializedName("value")
    private float value;

    public GoogleFitDataFloatValue() {
    }

    public GoogleFitDataFloatValue(String date, float value) {
        this.date = date;
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
