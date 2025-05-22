package com.emoney2.controller;

import com.emoney2.dto.ResponseDto;
import com.emoney2.dto.UnwardDto;
import com.emoney2.model.Unward;
import com.emoney2.service.UnwardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unward") //base url
public class UnwardController {
    private final UnwardService unwardService;

    public UnwardController(UnwardService unwardService) {
        this.unwardService = unwardService;
    }

    //http protocols post, patch, get, put, delete
    @PostMapping("/add")
    public ResponseEntity<ResponseDto<Object>> addUnward(@RequestBody UnwardDto load){
       return unwardService.register(load);
    }

    @PutMapping("/update")
    public String updateUnward(@RequestBody UnwardDto load, @RequestParam("id") Long id){
        return unwardService.update(load,id);
    }

    @GetMapping("/all")
    public List<Unward> allUnward(){
        return unwardService.getAll();
    }

    @DeleteMapping("/delete")
    public String deleteUnward(@RequestParam("id")Long id){
        return unwardService.delete(id);
    }
}
