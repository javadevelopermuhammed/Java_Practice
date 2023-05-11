package day_01;

public class C02_KullaniciBilgileri {

      /*
         isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            Isim: ...
            Soyisim: ...
            Yas: ...
            Boy: ...
            Kilo: ...
    Not: Sadece bir adet "System.out.println(); kullanınız.
    */

    public static void main(String[] args) {

        String isim = "Muhammed Emin";
        String soyIsim = "Kaba";
        int yas = 17;
        double boy = 174.6;
        double kilo = 65.7;


        System.out.println(isim);//Isim: Muhammed Emin
        System.out.println("Isim: "+isim + "\nSoyIsim: "+soyIsim + "\nYas: "+yas + "\nBoy: "+boy + "\nKilo: "+kilo);


    }

}
