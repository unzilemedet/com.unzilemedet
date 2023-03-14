package com.medetunzile;

import java.util.Scanner;

public class Runner_SwitchCase {
    public static void main(String[] args) {
        /*
       switch(durum){
           case 1. durum: işlem; break;
           case 2. durum: işlem; break;
           default: işlem
              }
   */
        System.out.println("******************");
        System.out.println("*****ISLEMLER*****");
        System.out.println();
        System.out.println("1. Toplama");
        System.out.println("2. Cıkarma");
        System.out.println("3. Carpma");
        System.out.println("4. Bolme");
        System.out.println("5. Mod");
        System.out.println("6. Cıkıs");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seciniz..");

        int secim = scanner.nextInt();

        if (secim == 1) System.out.println("Toplama");
        else if (secim == 2) System.out.println("Cıkarma");
        else if (secim == 3) System.out.println("Carpma");
        else if (secim == 4) System.out.println("Bolme");
        else if (secim == 5) System.out.println("Mod");
        else System.out.println("Cikis");

         switch(secim){
           case 1:
               System.out.println("Toplama");
               break ;

             case 2:
                 System.out.println("Cıkarma");
                 break;

             case 3:
                 System.out.println("Carpma");
                 break;

             case 4 :
                 System.out.println("Bolme");
                 break;

             case 5 :
                 System.out.println("Mod");
                 break;


             default:
                 System.out.println("Cıkıs");
                 break;
         }

         int ay =6;

         switch(ay){
             case 12,1,2:
                 System.out.println("kıs");
                 break;
             case 3,4,5:
                 System.out.println("ilkbahar");
                 break;
             case 6,7,8:
                 System.out.println("yaz");
                 break;
             case 9,10,11:
                 System.out.println("sonbahar");
                 break;
             default:
                 System.out.println("gecersiz giris");
         }


          String Mevsim= switch (ay){
              case 12,1,2 -> {System.out.println();
                              yield "kis";}
              case 3,4,5 ->   "ilkbahar"  ;
              case 6,7,8 ->   "yaz";
              case 9,10,11 -> "sonbahar";
              default ->      "gecersiz";

          };
    }
}