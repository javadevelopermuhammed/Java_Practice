package day_02;

public class C05_MethodCreation {
     /*
        1- Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */
     public static void main(String[] args) {

         int sayi1 = 15;
         int sayi2 = 19;
         System.out.println("swaptan önce  sayi1 = "+sayi1);
         System.out.println("swaptan önce sayi2 = "+sayi2);
         sayi1 = sayi1 + sayi2 ;
         sayi2 = sayi1 - sayi2 ;
         sayi1 = sayi1 - sayi2 ;
         System.out.println("swaptan sonra sayi1 = "+sayi1);
         System.out.println("swaptan sonra sayi2 = "+sayi2);
     }
}
