package com.example.BoonGsonSimpleJSON.GsonUtils.ExcludingFieldsFromSerialization.AtExpose;

import com.google.gson.annotations.Expose;

class Student {
    @Expose
    private int rollNo;

    @Expose
    private String name;
    private boolean verified;
    private int id;
    public static String className;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isVerified() {
        return verified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}