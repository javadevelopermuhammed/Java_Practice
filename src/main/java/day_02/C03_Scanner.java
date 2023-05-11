package day_02;

import java.util.Scanner;

public class C03_Scanner {
    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false dondursun

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int num1 = input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int num2 = input.nextInt();

        boolean conclusion = isSquaresEquals(num1,num2);
        System.out.println("conclusion = " + conclusion);

    }

    private static boolean isSquaresEquals(int num1, int num2) {
        boolean conclusion = (num1*num1) == (num2*num2);
                        //javada = isareti assignment operatordur
                        // == isareti ise matematikte kullandigimiz esittir gibidir
        return conclusion;
    }


}
