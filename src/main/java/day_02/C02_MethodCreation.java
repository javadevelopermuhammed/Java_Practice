package day_02;

import java.util.Scanner;

public class C02_MethodCreation {
    //kullanıcıdan fahrenheit cinsi bir deger girmesini isteyin
    // Fahrenheit değeri, Celsius değere çeviren method yazınız.
    // formül: c = (f-32)/1.8
    //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println("Bir Fahrenheit degeri giriniz");
        double fahrenheit = input.nextDouble();

        System.out.println("fahrenheit = " + fahrenheit);
        celcius(fahrenheit);
    }
    public static double celcius(double fahrenheit){
        double celcius = (fahrenheit-32)/1.8;
        System.out.println("celcius = " + celcius);
        return celcius;
    }



}
