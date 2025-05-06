package com.emoney2.service;

import com.emoney2.dto.UnwardDto;
import com.emoney2.model.Unward;
import com.emoney2.repository.UnwardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UnwardService {
    //Crud operation (create, update, get, delete)
    private final UnwardRepository unwardRepository;

    public String register(UnwardDto load) {
        Optional<Unward> unwardOptional= unwardRepository.findByEmailOrPhoneNumber(load.getEmail(), load.getPhoneNumber());
        //check if email exist , it should throw error
        if(unwardOptional.isPresent()){
            return "Email already exist";
        }
        Unward unward = new Unward(); //initilize
        unward.setEmail(load.getEmail());
        unward.setFullName(load.getFullName());
        unward.setNationality(load.getNationality());
        unward.setRace(load.getRace());
        unward.setPhoneNumber(load.getPhoneNumber());
        unward.setGenderIdentity(load.getGenderIdentity());
        unward.setDateCreated(new Date());
        unwardRepository.save(unward);
        return "Unward registered successfully";
    }

}
