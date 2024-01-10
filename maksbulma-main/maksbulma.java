package ders14;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

public class maksbulma {

   
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Üç sayı arasından maksimum sayıyı bulma... ");
        System.out.print("Birinci sayıyı giriniz: ");     
        int a = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");     
        int b = scanner.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");     
        int c = scanner.nextInt();
        
        int maks = -1; 
        /* Java fonksiyonu çalıştırırken maks değişkeni olmadığı için hatar
        vermesin diye maks değişkenimize herhangi bir sayı atarız. */
        
        if(a>=b && a>=c){ //AND operatörünü kullanarak koşullu fonk oluşturduk
        
        maks = a;
    }
    
        else if(b>=a && b>=c){
        maks =b;
    }
        
        else{
                maks = c;
                }
        
        System.out.print("Maksimum sayı: " + maks);
        
}
}