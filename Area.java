package Letcode;

import java.util.Scanner;

public class Area {


    public static void main(String[] args) {
        //Değişkenleri tanımladık.
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Üçgen alan hesaplayıcısına hoşgeldin..");
        System.out.println("Alanını hesaplamak istediğiniz üçgenin kenarlarını sırasıyla giriniz. ");
        //Kullanıcıdan verileri al
        System.out.println("1. Kenar: ");
        a=sc.nextInt();
        System.out.println("2. Kenar: ");
        b=sc.nextInt();
        System.out.println("3. Kenar: ");
        c=sc.nextInt();
     //Üçgen Alan formülü
        int u=(a+b+c)/2;
        double area=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: "+area);
    }

}