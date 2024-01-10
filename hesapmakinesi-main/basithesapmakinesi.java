package ders16;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;


public class basithesapmakinesi {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hesap makinesine hoş geldiniz..." +" İşlem seçiniz:");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        int islem = scanner.nextInt();
        
        switch (islem) {
            case 1:
                
                System.out.println("Toplama işlemi için gerekli iki sayıyı giriniz...");
                System.out.print("Birinci sayı: ");
                int a = scanner.nextInt();
                System.out.print("İkinci sayı: ");
                int b = scanner.nextInt();
                int toplama = a + b;
                System.out.println("Toplama işleminin sonucu: " +toplama);
                
            break;
            
            case 2: 
            
                System.out.println("Çıkarma işlemi için gerekli iki sayıyı giriniz...");
                System.out.print("Birinci sayı: ");
                int c = scanner.nextInt();
                System.out.print("İkinci sayı: ");
                int d = scanner.nextInt();
                int cıkarma = c - d;
                System.out.println("Çıkarma işleminin sonucu: " +cıkarma);
                
            break;
            
            case 3:
                System.out.println("Çarpma işlemi için gerekli iki sayıyı giriniz...");
                System.out.print("Birinci sayı: ");
                int e = scanner.nextInt();
                System.out.print("İkinci sayı: ");
                int f = scanner.nextInt();
                int carpma = e * f;
                System.out.println("Çarpma işleminin sonucu: " +carpma);
                
            break;
            
            case 4:
                System.out.println("Bölme işlemi için gerekli iki sayıyı giriniz...");
                System.out.print("Birinci sayı: ");
                int g = scanner.nextInt();
                System.out.print("İkinci sayı: ");
                int h = scanner.nextInt();
                int bolme = g / h;
                System.out.println("Bölme işleminin sonucu: " +bolme);
            break;
            
            default:
                System.out.println("Geçersiz işlem...");
            break;
            
        }
        
        
    }
    
}
