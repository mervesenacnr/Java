
import java.util.Scanner;

public class nothesaplama {


    public static void main(String[] args) {
  
        
        //gelişmiş not hesaplama programı...
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Sınav harf notunu hesaplama programına hoş geldiniz...");
        System.out.println("1.Sınav notumu biliyorum.");
        System.out.println("2.Sınav notumu bilmiyorum.");
        int not = scanner.nextInt();
        
        switch (not) {
            case 1:
               
                System.out.print("Lütfen sınav notunuzu giriniz: ");
                int a = scanner.nextInt();
                
                if(a>=90){
                    System.out.println("AA");
                }
                
                else if(a>=85 && a<90){
                    System.out.println("BA");
                }
                
                else if(a>=80 && a<85){
                    System.out.println("BB");
                }
                
                else if(a>=75 && a<80){
                    System.out.println("CB");
                }
                
                else if(a>=70 && a<75){
                    System.out.println("CC");
                }
                
                else if(a>=65 && a<70){
                    System.out.println("DC");
                }
                
                else if(a>=60 && a<65){
                    System.out.println("DD");
                }
                
                else if(a>=55 && a<60){
                    System.out.println("FD");
                }
                
                else if(a<55){
                    System.out.println("FF");
                }
                
                break;
                
            case 2: 
                
                System.out.print("Lütfen sınavdaki soru sayısını giriniz: ");
                int sorusayisi = scanner.nextInt();
                System.out.print("Lütfen sınavdaki doğru cevap sayınızı giriniz: ");
                int dogrucevap = scanner.nextInt();
                
                int hesaplama = (100 / sorusayisi) * dogrucevap;
                System.out.println("Sınav notunuz: " +hesaplama);
                
                int b = hesaplama;
                if(b>=90){
                    System.out.println("AA");
                }
                
                else if(b>=85 && b<90){
                    System.out.println("BA");
                }
                
                else if(b>=80 && b<85){
                    System.out.println("BB");
                }
                
                else if(b>=75 && b<80){
                    System.out.println("CB");
                }
                
                else if(b>=70 && b<75){
                    System.out.println("CC");
                }
                
                else if(b>=65 && b<70){
                    System.out.println("DC");
                }
                
                else if(b>=60 && b<65){
                    System.out.println("DD");
                }
                
                else if(b>=55 && b<60){
                    System.out.println("FD");
                }
                
                else if(b<55){
                    System.out.println("FF");
                }
                
                break;
                
            default:
                System.out.println("Geçersiz işlem...");
                break;
        }
        
        
        
        
        
    }
    
}
