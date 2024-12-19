package com.pantxi.RomaNumerals;

public class RomanNum {
    public static String convert(int nbr ){
        if (nbr <= 0 || nbr > 50)
            return "Nombre doit etre entre 1 et 50";


        StringBuilder r= new StringBuilder();
        // traitement des dizaines
        switch (nbr / 10) {
            case 1: r.append("X"); break;
            case 2: r.append("XX"); break;
            case 3: r.append("XXX"); break;
            case 4: r.append("XL"); break;
            case 5: r.append("L"); break;
        }
        nbr =nbr% 10; // pour ecraser les dizaines et laisser les unités
//traitement des unités
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

