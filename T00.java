//Sakeus Malau - 12S2038//
//Vita Naibaho - 12S2045//
import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;

        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        if (a % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (a > b) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (b > a) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Kedua bilangan sama besar");
            }
        }
        if (a % 2 == 0 && b % 2 == 0) {
            c = a + b;
            System.out.println("Hasil penjumlahan: " + c);
        } else {
            if (b % 2 != 0 && a % 2 != 0) {
                d = a * b;
                System.out.println("Hasil perkalian: " + d);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
