package com.medetunzile;

import java.util.Scanner;

public class Runner_Ornek {
    public static void main(String[] args) {
        //Bir algoritmanın karmaşıklığı ve zamanı nasıl bilirim.
         long start=System.currentTimeMillis();
         String ifade="Ahmet Gel";
        //Scanner scanner=new Scanner(System.in);
        //System.out.print("İşlem adedi giriniz...:");
        //int islemAdedi = scanner.nextInt();
        int islemAdedi=100_000;
         for(int i=0; i<islemAdedi; i++){
             ifade=ifade+i;
         }
         long end = System.currentTimeMillis();
         System.out.println("işlem süresi....:"+(end-start)+". milisaniye sürdü.");
         System.out.println("ifadenin uzunluğu...:"+ifade.length());


         StringBuilder stringBuilder = new StringBuilder();
         stringBuilder.append("Ahmet Gel");
         islemAdedi=100_000;
         for(int i=0; i<islemAdedi; i++){
             stringBuilder.append(i);
         }
         end = System.currentTimeMillis();
        System.out.println("İşlem süresi...."+(end-start)+".milisaniye sürdü.");
        System.out.println("işlem uzunluğu..."+stringBuilder.toString().length());
    }
}
