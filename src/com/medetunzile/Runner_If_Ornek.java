package com.medetunzile;

import java.sql.SQLOutput;

public class Runner_If_Ornek {
    public static void main(String[] args) {
        //if.... else if... else
        //Login işlemi
        // if

        int sayi = -20;
        if (sayi < 2) {
            System.out.println(" 20 2'den buyuktur");
        }
        //if...else
        String ka="admin", sf="123";
        if(ka=="admin" && sf=="1234" ){
            System.out.println("Başarı ile giriş yapıldı.");
        }else{
            System.out.println("Kullanıcı adı ya da şifresi hatalıdır.");
        }
        //if... elseif..else
        // öğrencinin not ortalamasını harf olarak ifade edelim
        int ort=44;
        if ( ort<10){
            System.out.println("FF");
        }
        else if(ort<20){
            System.out.println("FD");
            System.out.println();
        }
        else if(ort<30){
            System.out.println("DD");
        }
        else  if (ort<40){
            System.out.println("DC");
        }

        else  if (ort<50){
            System.out.println("CC");
        }

        else  if (ort<60){
            System.out.println("CB");
        }

        else  if (ort<70){
            System.out.println("BB");
        }

        else  if (ort<80){
            System.out.println("BA");
        }
        else System.out.println("AA");

    }
}


















