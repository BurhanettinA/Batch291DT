package d28exception_enum;

public class E11 {
    public static void main(String[] args) {
        int a = 12;
        int b = 4;
        int[] c = {3, 5, 7, 9};// 0 1 2 3 index de 9 var.
        bring(c, a, b);
    }

    public static void bring(int[] c, int a, int b) {
        try {

            int idx = a / b;
            int element = c[idx];
            System.out.println(element);

        } finally {

            System.out.println("Veritabani baglantisi kesilmelidir");

        }

        System.out.println("finally sonrasi app calisiyor");

    }

}