
import java.util.Scanner;

public class BedenKitleIndeksi {
    public static void main(String[] args) {
        
        // KİLO / BOY * BOY = BKİ 
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Kilonuzu giriniz: ");
        int kilo = scanner.nextInt();
        
        System.out.println("Boyunuzu giriniz (ör:1,62): ");
        double boy = scanner.nextDouble();
        
        double bki = kilo / (boy * boy);
        
        System.out.println("Beden kitle indeksiniz: " +bki);
        
        
        
        
                
        
        
        
    }
}
