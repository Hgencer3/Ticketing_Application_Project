package com.cydeo.enums;

public enum Gender {
    MALE("male"),FEMALE("Female");
    private final String value;
    Gender(String value) {
    this.value=value;
    }
    public String getValue(){
        return value;
    }
}
