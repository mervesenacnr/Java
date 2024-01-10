package ders15;

import java.util.Scanner;

public class bedenkitleindeksi2 {

    
    public static void main(String[] args) {
       
        /*
        kullanıcının boy ve kilosu ile beden kitle indeksi hesaplama:
        Beden kitle indeksi= kilo / boy * boy
        
        BKİ= 18.5'in altındaysa -> ZAYIF
        
        BKİ= 18.5 ile 25 arasındaysa -> NORMAL
        
        BKİ= 25 ile 30 arasındaysa -> FAZLA KİLOLU
        
        BKİ= 30'un üstündeyse -> OBEZ
        */
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Beden Kitle İndeksi hesaplama programına hoşgeldiniz...");
        
        System.out.print("Lütfen boyunuzu giriniz(Ör: 1,62): ");
        double boy = scanner.nextDouble();
        
        System.out.print("Lütfen kilonuzu giriniz(Ör:52.8): ");
        double kilo = scanner.nextDouble();
        
        double bki = kilo / (boy*boy);
        
        if (bki<18.5) {
            
            System.out.println(bki + " Zayıfsınız...");
            
        }
        
        else if(bki>=18.5 && bki<=25.0){
            
            System.out.println(bki + " Normalsiniz..."); 
            
    }
        
        else if(bki>25.0 && bki<=30.0){
            System.out.println(bki +" Fazla kilolusunuz...");
        }
    
        else{
            
            System.out.println(bki+ " Obezsiniz...");
            
        }
}
}
