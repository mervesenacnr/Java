
import java.util.Scanner;

public class carpimtablosu {

    public static void main(String[] args) {
       
        
        /*
        çarpım tablosu notlarım:
        0'dan 10'a kadar olacak 0 değişmeyecek ve her defasında 1 arttırıp 10'a kadar çarptıracağım
        0 sbt * 0 degisken = 0
        0 sbt * 1 degisken = 0
        ...
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Çarpım tablosuna hoş geldiniz... ");
        
        for (int sayi = 0; sayi <= 10; sayi++) {
            
            for (int degisken = 0; degisken <= 10; degisken++  ) {
                
                int carpım = sayi * degisken;
                
                System.out.println(sayi +" * "+degisken +" = "+carpım );
                
            }
            System.out.println("******************************");
        }
       
        
    }
    
}
