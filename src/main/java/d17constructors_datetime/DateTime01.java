package d17constructors_datetime;

import java.time.LocalDate;

public class DateTime01 {
    public static void main(String[] args) {

//LocalDate java.time paketinde yer alan bir classtir.
//Bu sınıf, tarih bilgilerini temsil etmek ve işlemek için kullanılır.
//Java'da java.time.LocalDate class'i, yerel tarihleri temsil etmek için kullanılır
// ve saat bilgisini içermez, yani sadece gün, ay ve yıl bilgilerini içerir.

//---------------
//ornek 1: now(): Geçerli tarihi alır. Tarih bilgisini yerel bilgisayarınızın saatinden alır,
// yani sizin bilgisayarınızın saatinden gelir

        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);//2024-10-02



    }
}
