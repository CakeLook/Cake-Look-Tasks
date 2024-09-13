package org.cakelook.Classes;

import lombok.Getter;

@Getter
public class Auto {

    private String znacka;
    private String model;
    private int rok;
    public Auto(String znacka, String model, int rok){
        this.znacka = znacka;
        this.model = model;
        this.rok = rok;
    }


}
