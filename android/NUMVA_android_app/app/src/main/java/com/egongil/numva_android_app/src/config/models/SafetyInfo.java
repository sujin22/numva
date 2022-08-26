package com.egongil.numva_android_app.src.config.models;

public class SafetyInfo {
    int id;
    String name;
    String memo;
    String safety_number;

    public SafetyInfo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMemo() {
        return memo;
    }

    public String getSafety_number() {
        return safety_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SafetyInfo setMemo(String memo) {
        this.memo = memo;
        return this;
    }
}
