package com.egongil.numva_android_app.src.cert_phone.models;

import com.google.gson.annotations.SerializedName;

public class PassRequest {

    @SerializedName("imp_uid")
    private String imp_uid;

    public void setImp_uid(String imp_uid){this.imp_uid = imp_uid;}
}
