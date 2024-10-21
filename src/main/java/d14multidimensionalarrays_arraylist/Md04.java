package d14multidimensionalarrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {

/*ArrayList, dinamik boyutlu bir array'dir; eleman ekleyip çıkarırken boyutu otomatik olarak ayarlanır.
 Gerçek hayatta bir alışveriş listesi gibi düşünülebilir.
 Alışveriş listesi, ürün isimlerini içerir ve bu isimler String türündedir.*/

    /*
1)Array'ler primitive data type'lari ve reference'lari depolayabilir ama Arraylist'ler
non-primitive'leri (reference'lari) depolar
2)ArrayListler memory'de Array'lerden daha fazla yer kaplar
3)Array'ler olusturulurken bastan eleman sayisini belirtmek zorundayiz
4)ArrayList'ler eleman sayisinda esnektirler.
5) Array'leri Java niye iptal etmedi?
    a) Array'ler cok daha hizlidir
    b) Array'ler memory'de cok az yer kaplarlar
    c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Array'ler tercih edilir

6) Java'da generic (kapsamli) türler (<> ile belirtilen türler) için yalnızca referans
veri türleri kullanılabilir. Primitive veri türleri (örneğin int, char, boolean, double, vb.)
 doğrudan generic türlerin içine yerleştirilemez. Bu nedenle, özel bir durumla karşılaştığınızda,
 bu türleri ilgili sınıflarla sarmalamanız (wrapper) gerekir.
*/
        //Java 7: Programlama dilinin sürümüdür.
        //JDK 7: Java 7 ile yazılım geliştirmek için kullanılan araç setidir.


   //ArrayList nasil olusturulur?
        //ArrayList<Integer> ages = new ArrayList<Integer>(); //  java 6 ve öncesi
        ArrayList<Integer> ages = new ArrayList<>(); // java 7 ve sonrasi icicin  - type cikarimi soldan tipi aliyor

//----------------------
// ArrayList ler nasil eleman eklenir?


    }
}
