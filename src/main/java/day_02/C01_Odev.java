package day_02;

public class C01_Odev {
    //iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz
    //main methodun içinde tanımladıgım iki sayının kareleri toplamını bulan ve yazdıran bır method olusturun
    public static void main(String[] args) {


        square(12,10);


    }

    public static void square(int a, int b){
        int sumOfSquares = a*a + b*b;
        System.out.println("sum Of Squares = " + sumOfSquares);
    }
}
