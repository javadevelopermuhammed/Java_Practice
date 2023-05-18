package day_03;

import java.util.Scanner;

public class C02_IfElse {
    // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
    // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int num1 = input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int num2 = input.nextInt();

        if (num1>num2) {
            System.out.println("Birinci sayi ikinci sayidan buyuktur..");
        }else{
            System.out.println("Birinci sayi ikinci sayidan buyuk degildir..");
        }
    }


}
