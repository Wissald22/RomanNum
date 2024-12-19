package com.pantxi.RomaNumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumTest {
    @Test
    public void convertTest(){
        assertEquals("XLIX",RomanNum.convert(49));

    }
}
