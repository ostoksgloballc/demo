package com.emoney2.service;

import com.emoney2.dto.ResponseDto;
import com.emoney2.dto.UnwardDto;
import com.emoney2.exception.BadRequestException;
import com.emoney2.model.Unward;
import com.emoney2.repository.UnwardRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.ok;

@Service

public class UnwardService {
    //Crud operation (create, update, get, delete)
    private final UnwardRepository unwardRepository;

    public UnwardService(UnwardRepository unwardRepository) {
        this.unwardRepository = unwardRepository;
    }

    public ResponseEntity<ResponseDto<Object>> register(UnwardDto load) {
        Optional<Unward> unwardOptional= unwardRepository.findByEmailOrPhoneNumber(load.getEmail(), load.getPhoneNumber());
        //check if email exist , it should throw error
        if(unwardOptional.isPresent()){
            throw new BadRequestException("Unward not found");
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
        ResponseDto<Object> responseDto = new ResponseDto<>();
        responseDto.setStatusMessage("00");
        responseDto.setData(unward);
        return ResponseEntity.ok(responseDto) ;
    }

    public String update(UnwardDto load, Long id) {
        Optional<Unward> unwardOptional= unwardRepository.findById(id);
        //check if email exist , it should throw error
        if(unwardOptional.isPresent()){
            Unward unward = unwardOptional.get();
            unward.setEmail(load.getEmail());
            unward.setFullName(load.getFullName());
            unward.setNationality(load.getNationality());
            unward.setRace(load.getRace());
            unward.setPhoneNumber(load.getPhoneNumber());
            unward.setGenderIdentity(load.getGenderIdentity());
            unward.setDateCreated(new Date());
            unwardRepository.save(unward);
            return "Unward registered successfully";
        }else {
            return "No record found";
        }
    }

    public List<Unward> getAll(){
        return unwardRepository.findAll();
    }

    public String delete(Long id){
        Optional<Unward> unwardOptional= unwardRepository.findById(id);
        if(unwardOptional.isPresent()){
            Unward unward = unwardOptional.get();
            unwardRepository.delete(unward);
            return "Record successfully deleted";
        }else{
            return "Record not found";
        }
    }

}
