package com.medetunzile;
public class Runner_Ternary {
    public static void main(String[] args) {
        //if-->Ternary
        /**
         * *durum-(boolean) ? işlem: işlem;
         * 1-2 adet iç içe mantıklı olabilir. Fazlası kodun okunurluğuna ve düzenine zarar verebilir.
         */
        int yas=18;
        String uygunluk;
        if(yas>=18){
            uygunluk="UYGUNDUR";
        }else {
            uygunluk="UYGUN DEGIL";
        }
        System.out.println(uygunluk);
        yas=10;
        uygunluk= yas>= 18 ? "UYGUN" : "UYGUN DEGIL";
    }
}






















