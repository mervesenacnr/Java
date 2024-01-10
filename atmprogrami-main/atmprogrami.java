import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

public class atmprogrami {

   
    public static void main(String[] args) {
        
        
        /*
        
        1.İşlem: Bakiye Öğrenme
        2.İşlem: Para çekme
        3.İşlem: Para yatırma
        Çıkış: p 
        
        */
        
       
        
        Scanner scanner = new Scanner(System.in);
      
        int bakiye = 1000;
        
        String islemler = "1.İşlem: Bakiye Öğrenme\n" 
        +"2.İşlem: Para çekme\n" 
        +"3.İşlem: Para yatırma\n"
        +"Çıkış: p\n ";
        System.out.println("*****************************");
        System.out.println(islemler);
        System.out.println("*****************************");
        
        while (true) {            
            System.out.println("İşlemi seçiniz: ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Sistemden çıkış yapılıyor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: "+bakiye);
            }
            else if (islem.equals("2")) {
                System.out.println("Çekmek istediğiniz tutar: ");
                int tutar= scanner.nextInt();
                scanner.nextLine();
                
                if (bakiye - tutar < 0) {
                    System.out.println("Yeterli bakiyeniz yok. Bakiyeniz: "+bakiye);}
                    else{
                            bakiye -= tutar;
                            }
                    
                System.out.println("Yeni bakiyeniz: "+bakiye);
                
            }
            else if (islem.equals("3")) {
                System.out.println("Yatırmak istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz: "+bakiye);
            }
            
            
            
            
        }
    }
    
}
