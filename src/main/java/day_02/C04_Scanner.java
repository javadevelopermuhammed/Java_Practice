package day_02;

import java.util.Scanner;

public class C04_Scanner {
    //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Bir karakter giriniz");
            char c1 = input.next().charAt(0);
            System.out.println("==========CEVAP==========");
            gorunum(c1);
        }

    private static void gorunum(char c1) {
        System.out.println("  " + c1);
        System.out.println(" " + c1 + " " + c1);
        System.out.println(c1 + " " + c1 + " " + c1);

    // \n isareti bir alt satira gecmeyi saglar !! "" icinde yazilir
        System.out.println("==========Cevap 2.yol==========");
        System.out.println("  "+c1+"  \n"+" "+c1+" "+c1+" \n"+c1+" "+c1+" "+c1);

    }


}
