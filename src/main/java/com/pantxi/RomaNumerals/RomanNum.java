package com.pantxi.RomaNumerals;

public class RomanNum {
    public static String convert(int nbr ){
       //traitement des unités
        StringBuilder r= new StringBuilder();
        switch (nbr) {
            case 9: r.append("IX"); break;
            case 8: r.append("VIII"); break;
            case 7: r.append("VII"); break;
            case 6: r.append("VI"); break;
            case 5: r.append("V"); break;
            case 4: r.append("IV"); break;
            case 3: r.append("III"); break;
            case 2: r.append("II"); break;
            case 1: r.append("I"); break;
        }

        return r.toString();
    }

}

