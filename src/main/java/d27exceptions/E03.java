package d27exceptions;

public class E03 {
    public static void main(String[] args) {
        //3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.
        String s = "Java";
        //selectChar(s,2);//v
        selectChar(s, 5);

    }//main disi

    public static void selectChar(String s, int idx) {
        try {

            char ch = s.charAt(idx);
            System.out.println(ch);//StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan indexleri kullanmayiniz :" + e.getMessage());//Olmayan indexleri kullanmayiniz :String index out of range: 5
            e.printStackTrace();//exceptionu gormek istersek kullaniriz.Burada exception firlatilmaz.
            //Developer printStackTreace kullanir hatalari gormek icin.
        }
        System.out.println("App calisiyor");
    }
}