package com.example.awspipetest2.controllers;

import com.example.awspipetest2.TeaPot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping(path="/tea")
public class TeaController {

    @Autowired
    TeaPot teaPot;


    @GetMapping(path="/cups")
    public ResponseEntity<Integer> getCups(){
        return new ResponseEntity<>(teaPot.getCups(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<String> tea(){
        return new ResponseEntity<>("Soooo.... I have changed this a tiny git to see if I can push", HttpStatus.I_AM_A_TEAPOT);
    }



}
