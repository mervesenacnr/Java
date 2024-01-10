
import java.util.Scanner;

public class rakamlarintoplami {

   
    public static void main(String[] args) {
       
        // ör: 1234 sayısının rakamları toplamı= 1+2+3+4=10dur.
        
        Scanner scanner = new Scanner(System.in);
        
        int toplam=0;
        
        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();
        
        do {
            toplam += sayi % 10;
            sayi /= 10;
            
            
        } while (sayi>0);
        
        System.out.println("Girdiğiniz sayının rakamlar toplamı: " +toplam);
    }
    
}

/*
toplam += sayi % 10 demektir ki 0 ile girdiğimiz sayının 10dan bölümünün kalanı toplama eşittir

ör: toplam = 0
    sayi = 1234
1- 1234%10 = 4 ... 0 + 4 = 4  ... toplam = 4
   1234/10= 123... sayi = 123

2- 123%10=3... 4+ 3 = 7... toplam = 7
   123/10=12... sayi =12

3- 12%10=2... 2+7=9... toplam = 9
   12/10=1... sayi=1

4- 1+9=10... toplam 10

*/