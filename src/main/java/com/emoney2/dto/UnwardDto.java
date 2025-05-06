package com.emoney2.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class UnwardDto {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String genderIdentity;
    private String nationality;
    private String password;
    private String maritalStatus;
    private String placeOfBirth;
    private String occupation;
    private String stateOfOrigin;
    private String race;
}
