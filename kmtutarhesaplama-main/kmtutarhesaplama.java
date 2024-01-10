
import java.util.Scanner;
import javax.sound.midi.Soundbank;

/* 
Bir aracın kilometrede ne kadar yaktığını ve kaç kilometre yol gittiğini alın ve
toplam ne kadar ödemesi gerektiğini hesaplayın.
Ör: Doblo 1,60 TL/km  yakar ve İzmir'den İstanbul'a(480km) yolculuk yapmıştır. 
Toplamda ödemesi gereken tutar: 768.0 TL'dir.
*/

public class kmtutarhesaplama {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Aracınız kilometrede kaç kuruş yakıyor? (Ör: 0,32)");
        double kurus = scanner.nextDouble();
        
        System.out.println("Aracınızla kaç km gittiniz? ");
        int km = scanner.nextInt();
        
        System.out.println("Toplam ödemeniz gereken tutar: " + (kurus * km)+ " TL");
        
        
        
        
        
    }
    
}
