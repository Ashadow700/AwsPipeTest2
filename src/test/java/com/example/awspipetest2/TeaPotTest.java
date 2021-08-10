package com.example.awspipetest2;

import org.junit.jupiter.api.Test;

public class TeaPotTest {


    @Test
    public void cupsTest() {

        //Given
        TeaPot teaPot = new TeaPot();

        //when
        teaPot.setCups(4);

        //then
        int res = teaPot.getCups();
        assert(4 == res);

    }

}
