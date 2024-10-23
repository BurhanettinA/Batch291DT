package d28exception_enum;

import static d28exception_enum.ExceptionRunner.studentGrade;

public class ExceptionRunner2 {
    public static void main(String[] args) {
        numberOfStudents(-45);
    }//main disi
    public static void numberOfStudents (int sayi){

        if (sayi<0){
            throw new InvalidNumberException("Bir okuldaki ogrenci sayisi negatif olamaz");

        }else {
            System.out.println(sayi);
        }
    }



        }








