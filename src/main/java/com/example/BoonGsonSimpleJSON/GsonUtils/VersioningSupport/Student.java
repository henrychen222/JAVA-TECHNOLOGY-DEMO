package com.example.BoonGsonSimpleJSON.GsonUtils.VersioningSupport;

import com.google.gson.annotations.Since;

class Student {
    @Since(1.0)
    private int rollNo;

    @Since(1.0)
    private String name;

    @Since(1.1)
    private boolean verified;

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
}