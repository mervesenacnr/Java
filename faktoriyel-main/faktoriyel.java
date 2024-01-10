
import java.util.Scanner;

public class  faktoriyel{


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        
        int faktoriyel =  1;
        
        int sayi = scanner.nextInt();
        
        for( int i=1; i<=sayi; i++)   {     
        
            faktoriyel *= i;
    }
    
        System.out.println("Sayının faktoriyeli: "+faktoriyel);
}
}

/*

Kodun çalışma sistemi: 
sayı girdiğimizde for döngümüzün kaç kez çalışacağını hesaplamış oluruz. 
1(faktoriyel değişkeni)'den başlayarak her defasında 1 arttırılıp i değişkeniyle çarpılır.
Ta ki girdimize (sayi) ulaşana kadar.

örnek:
Bir sayı giriniz:
sayi = 4 -------> i<=4 (yani 4 kez for döngüsü çalışacak.)
i * faktoriyel = faktoriyel
1- 1*1  = 1 
2- 2*1  = 2
3- 3*2 = 6
4- 4*6 = 24 (faktoriyel)


*/