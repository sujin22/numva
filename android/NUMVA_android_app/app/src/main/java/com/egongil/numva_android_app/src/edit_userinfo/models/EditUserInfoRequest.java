package com.egongil.numva_android_app.src.edit_userinfo.models;

import com.google.gson.annotations.SerializedName;

public class EditUserInfoRequest {

    @SerializedName("phone")
    private String phone;

    @SerializedName("birth")
    private String birth;

    @SerializedName("nickname")
    private String nickname;

    public void setPhone(String phone){this.phone = phone;}
    public void setBirth(String birth){this.birth = birth;}
    public void setNickname(String nickname){this.nickname = nickname;}

}
