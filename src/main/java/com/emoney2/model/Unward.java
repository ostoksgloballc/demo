package com.emoney2.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "agile")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
@SequenceGenerator(
        name = "agile_sequence_gen",
        sequenceName = "agile_seq",
        allocationSize = 1)

public class Unward {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE,generator ="agile_sequence_gen" )
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

}
