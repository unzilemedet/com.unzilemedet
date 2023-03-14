package com.medetunzile;

import java.util.Scanner;

public class Runner_StringKullanimi {
    public static void main(String[] args) {
        String ifade ="Bugün hava çok guzel";
        String tekharf="u";
        /*
        * String Uzunluğu
        * değişken.length()---> ifadenin uzunluğunu int türünden verir.
        */
        int ifadeninuzunlugu = ifade.length();
        int tekharfinuzunlugu= tekharf.length();

        System.out.println("Ifadenin uzunlugu:"+ ifadeninuzunlugu);
        System.out.println("Tek harf uzunluğu:"+ tekharf.length());
        System.out.println("Tek harf uzunluğu:"+ tekharfinuzunlugu);
        System.out.println("-----------------------------------------------------------------");
        /*
        * ifadenin içindeki bir karakteri almak
        * Getting a single char
         */

        //ifadenin index numarası 13 olan karakterini al
        //bilgisayar sisteminde başlangıç sayı index değerimiz sıfırdır.
        System.out.println("13. karakter nedir?  :" + ifade.charAt(13));

        System.out.println(ifadeninuzunlugu+ " degere erisim :"+ ifade.charAt(ifadeninuzunlugu-1));

        /*
        * Finding index
        * */
        //ifadeninin içinde aranılan değerin ilk geçtiği index numarasını int olarak döner.
        //eğer aranılan değer bulunamazsa -1 değeri döner
        System.out.println("a harfi ilk nerede geçmaktedir?..:"+ ifade.indexOf("a"));

        //ifadenin yarısından sonra u harfi ilk nerede geçmektedir.
        System.out.println("a harfi ilk nerede geçmektedir?..:"+ifade.indexOf("u",(ifadeninuzunlugu/2)));

        System.out.println("-----------------------------------------------------------------");
        /*
        * Getting a substring
        * substring(beginingindex, endindex)
        * substring(beginingindex)
        * */

        System.out.println("kesilecek ifade");
        System.out.println("kesilecekifade.substring(2,6)...:"+"kesilecekifade.substring(2,6)...:"+ifade.substring(2,6));
        //ikinci index dahil 6. index dahil değil [2,6) aralığını gösterir

        System.out.println("ifadenin  yarisi:" +ifade.substring(0,(ifadeninuzunlugu/2)));

        String yarimIfade= ifade.substring(0,(ifadeninuzunlugu/2));
        System.out.println("a harfini ara..:"+ yarimIfade.indexOf("a",6));

        System.out.println("istenilen konumdan kesmek..:"+ ifade.substring(10));
        //10. indexten sonra keser

        /*
        * trim()--> bir ifadenin başında ve sonunda olan boşlukları siler
        * */
        String sifre="admin", kullaniciadi="admin";
        if(sifre.trim()=="admin" && kullaniciadi.trim()=="admin"){
            System.out.println("giris yapabilirsiniz...");
        }else{
            System.out.println("gecersiz giris...");
        }
        System.out.println("-----------------------------------------------------------------");
        /*
        * Adjusting Case
        * upperCase--> ifadenin tamamını büyük harf yapar
        * lowerCase--> ifadenin tamamını küçük harf yapmar
        * toUpperCase(Locale.ENGLISH) ingilizcede i--->I
        * toLowerCase(Locale.ROOT)    Türkçe'de   i--->İ
        * */

        System.out.println("Sifre...:"+sifre.toUpperCase() + " Kullanici Adi..: "+ kullaniciadi.toLowerCase());


        System.out.println("-------------------------------------------------------");
        /*
        ÖNEMLİ
        Bir yerde (database,file) kullanıcı bilgilerini tuttuğumuzu düşünelim.
         */

        String dbEmail="medetunzile@gmail.com";
        String dbSifrem="1234";
        Scanner scanner=new Scanner(System.in);
        System.out.println("************************");
        System.out.println("*******LOGIN********");
        System.out.println("*************************");
        System.out.println("Kullanici adi(email) giriniz.");
        String scEmail= scanner.nextLine(); // metin girilip enter'a basılınca değeri string olarak alır.
        System.out.println("Sifrenizi Giriniz.");
        String scSifre = scanner.nextLine();

        /* .trim()-> baştaki ve sondaki boşlukları alır. "  selam arkadaşlar  ".trim();--> "selam arkadaşlar"
        */

       //Asağıdaki kullanım doğru değildir.
        /*   if(dbEmail.toLowerCase()==scSifre.trim().toLowerCase()){
                System.out.println("Sisteme giriş yapabilirsiniz.");
           }else{
            System.out.println("Kullanici adi ya da sifre hatali.");
        }*/

        //"Unzile".equals("Unzile")--> true
        //dbSifrem.equals(scSifrem.trim())
        if(dbEmail.toLowerCase().equals(scEmail.trim().toLowerCase()) && dbSifrem.equals(scSifre.trim()))
        {
            System.out.println("Sisteme giriş yapabilirsiniz.");
        }else{
            System.out.println("Kullanıcı adı ya da şifre hatalıdır.");
        }

        System.out.println("-----------------------------------------------------------------");
        /*----REPLACING VALUES-----
        * "Ayşe bize Geldi.".replace("ş","s")----> Ayse bize Geldi.
        * "Ayşe bize Geldi.".replace('ş','s')----> Ayse bize Geldi.
        */
        /*
        * ÖRNEK 1)Kira sözleşmesi olsun kira sözleşmesindeki isimler değişsin.
        */
        String sozlesme="Ahmet Bey, evini Hakan Koc'a kiraladi. ";
        String yeniSozlesme=sozlesme.replace("Hakan Koc","Aslı Bas");
        System.out.println("Yeni Sozlesme:"+yeniSozlesme);
        System.out.println("-----------------------------------------------------------------");

        /*
        * 2) web url-->Boşluk, Türkçe karakter sorun olabilir
        * htpps://www.isbasvurusu.org/unzilehoca iş başvurusu.pdf-->404 hatasına sebep olabilir
        * */

        String dosyaAdi="unzilehoca iş başvurusu.pdf";
        dosyaAdi=dosyaAdi.replace(" ","-").replace("ş","s");
        System.out.println(dosyaAdi);

        System.out.println("-----------------------------------------------------------------");
        /*
        * .contains()
        * bir String ifade içinde aranılan değerin olup olmadığını kontrol eder.--> true/false
        * "Bugün hava çok yağışlı".contains("ış");--> true
        * */
        String yeniIfade="Bugün ifade çok yağışlı ama ben dışarı çıkacağım";
        System.out.println("İfadede en var mı?:"+yeniIfade.contains("en"));  //true
        System.out.println("İfadede en var mı? :"+yeniIfade.contains(" en")); //false
        System.out.println("İfadede en var mı?:"+yeniIfade.contains("en ")); //true


        System.out.println("-----------------------------------------------------------------");
        //.equals()-->iki ifade birbirine eşit mi diye bakar.
        //.equalsIgnoreCase-->iki fadenin harflerini küçük yapar daha sonra birbirine eşit mi diye bakar.
        //"Unzile DEneme".equalsIgnoreCase("Unzile deneme")---->true
        //"Unzile DEneme".equals("Unzile deneme")--->//false
        System.out.println("Unzile DEneme".equalsIgnoreCase("Unzile deneme"));//true
        System.out.println("Unzile DEneme".equals("Unzile deneme")); //false


        System.out.println("-----------------------------------------------------------------");
        /*
        *startsWith, endsWith
        * "abcd".startsWith("a")-->true
        * "abcd".startsWith("A")-->false
        * "abcd".endsWith("D")-->false
        * "abcd".endsWith("d")-->true
        *Dizi kullanımında-->split()
        * */
        String kelime="Unzile";
        System.out.println(kelime.startsWith("U"));  //TRUE
        System.out.println(kelime.startsWith("u"));  //FALSE
        System.out.println(kelime.endsWith("E"));    //FALSE
        System.out.println(kelime.endsWith("e"));    //TRUE

        /*
        * .split(" , ") aranan ifadeye [regex] e göre metni string array haline getirir.
        * */
        String isimler="Unzile,Ayşe,Enes,Nefes";
        String[] isimlerListesi=isimler.split(",");
        System.out.println("2.kişi->"+isimlerListesi[1]);

        System.out.println("-----------------------------------------------------------------");

        String ogrencilerListesi="OKL1,Unzile,19 ;OKL2,Ayşe,15 ; OKL3,Enes,17";
        String[] ogrenciler=ogrencilerListesi.split(";");
        String[] ogrenciBilgisi=ogrenciler[1].split(",");
       for(String ogrenci: ogrenciBilgisi)
           System.out.println(ogrenci);
    }
}


























