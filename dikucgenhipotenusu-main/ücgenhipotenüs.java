package ders.pkg9;

//bir dik üçgenin hipotenüsünü bulunuz. hipotenüs= a^2 + b^2 = c^2.

import java.util.Scanner;

public class ücgenhipotenüs {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.println("Dik üçgenin kenarlarını giriniz...");
        System.out.println("Dik kenar: ");
        a = scanner.nextInt();
        System.out.println("Dik kenar: ");
        b = scanner.nextInt();
        
        int h = (int) Math.sqrt(a*a + b*b);
        
        /*
        java kütüphanesinde kare kökünü alma işlemi yok 
        bu yüzden Math kütüphanesini kullanırız.
        */
        
        System.out.println("Dik kenarlar: " + a + " " + b);
        System.out.println("Hipotenüs:" + h);
        
        
    }
    
}
