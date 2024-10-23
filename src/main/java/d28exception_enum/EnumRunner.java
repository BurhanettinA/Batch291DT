package d28exception_enum;

import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        //Cities c = new Cities(); //HATA-enum'dan object uretemezsiniz

        //1- Enum daki bir sabite nasil ulasabiliriz?
        Cities il = Cities.AKSARAY;
        System.out.println(il); //AKSARAY

        //2- BURSA sabitinin ismine ulasalim
        String ilIsmi = Cities.BURSA.getCityName();
        System.out.println(ilIsmi); //Bursa

        //3- Ankara'nin posta koduna ulasalim
        String postaKodu = Cities.ANKARA.getPostalCode();
        System.out.println(postaKodu); //06000

        //4- Antalya’nin plaka koduna ulasalim
        System.out.println(Cities.ANTALYA.getPlateCode()); //7

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        //values() methodu enum icindeki tum datalari bir Array icinde bize verir

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen plaka kodu giriniz");
        int plaka = input.nextInt();

    }
}