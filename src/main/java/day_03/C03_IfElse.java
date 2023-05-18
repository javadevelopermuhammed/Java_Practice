package day_03;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("İki sayi giriniz");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a>0 && b>0) {
            System.out.println(a+b);
        } else if (a<0 && b<0) {
            System.out.println(a*b);
        } else if ( a<0 || b<0) {
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsin!!");
        }else{
            System.out.println("Sifir carpmaya gore etkisiz elemandir!!");
        }

    }
}
