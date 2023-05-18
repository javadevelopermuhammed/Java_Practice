package day_03;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        //kullanıcıdan pozitif bir sayı alınız
        //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
        // ve yazdıran bir method olusturun
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz..");
        int sayi = input.nextInt();

        basamakSayisi(sayi);

    }

    private static void basamakSayisi(int sayi) {
        System.out.println(sayi>99 ? "Sayi uc veya daha cok basamakli" : "Ucten az basamakli");
    }
}
