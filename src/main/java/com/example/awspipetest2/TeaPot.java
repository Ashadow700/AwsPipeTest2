package com.example.awspipetest2;

import org.springframework.stereotype.Component;

@Component
public class TeaPot {

    private int cups;

    public TeaPot() {
        cups = 5;

    }

    public TeaPot(int cups) {
        this.cups = cups;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }


}
