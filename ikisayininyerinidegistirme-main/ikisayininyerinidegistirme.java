
import java.util.Scanner;

/* 
iki sayının değerlerini birbiriyle değiştiriyoruz. yani a=5, b=3 ise 
işlemden sonra a=3, b=5 olur.
*/


public class ikisayininyerinidegistirme {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int birinci_sayi;
        int ikinci_sayi;
        
        System.out.print("Birinci sayı: ");
        birinci_sayi = scanner.nextInt();
        
        System.out.print("İkinci sayı: ");
        ikinci_sayi = scanner.nextInt();
        
        System.out.println("Değiştirilmeden önce sayılar... ");
        System.out.println("Birinci sayı: " + birinci_sayi + " İkinci sayı: " + ikinci_sayi);
        
        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;
        
       System.out.println("Değiştirildikten sonra sayılar... ");
        System.out.println("Birinci sayı: " + birinci_sayi + " İkinci sayı: " + ikinci_sayi);
        
        
    }
    
}
