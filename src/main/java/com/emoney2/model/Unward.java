package com.emoney2.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "unward")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
@SequenceGenerator(
        name = "unward_sequence_gen",
        sequenceName = "unward_seq",
        allocationSize = 1)

public class Unward {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator ="unward_sequence_gen" )
    private Long id;
    @Column(name = "Full_name",unique = true)
    private String fullName;
    @Column(name = "email",unique = true)
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "gender_identity")
    private String genderIdentity;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "password")
    private String password;
//@Column(EnumType.STRING)....Question on this
//Private AppStatus accountStatus = AppStatus.COMPLETED

    @Column(name = "marital_status")
    private String maritalStatus;
    @Column(name = "place_of_birth")
    private String placeOfBirth;
    @Column(name = "occupation")
    private String occupation;
    @Column(name = "state_of_origin")
    private String stateOfOrigin;
    @Column(name = "race")
    private String race;
    @Column(name = "date_created")
    private Date dateCreated;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGenderIdentity() {
        return genderIdentity;
    }

    public void setGenderIdentity(String genderIdentity) {
        this.genderIdentity = genderIdentity;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
