package com.egongil.numva_android_app.src.parkingmemo.models;

import com.google.gson.annotations.SerializedName;

public class GetParkingMemoRequest {
    @SerializedName("safety_info_id")
    int safety_info_id;

    public void setSafety_info_id(int safety_info_id) {
        this.safety_info_id = safety_info_id;
    }
}
