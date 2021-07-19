package com.example.awspipetest2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/tea")
public class controller {


    @GetMapping(path="/get")
    public ResponseEntity<String> getStudent() {
        return new ResponseEntity<>("Basic get response", HttpStatus.OK);
    }
    @GetMapping(path="/tea")
    public ResponseEntity<String> tea(){
        return new ResponseEntity<>("I agree. It is time for a tea and fika break", HttpStatus.I_AM_A_TEAPOT);
    }

}
