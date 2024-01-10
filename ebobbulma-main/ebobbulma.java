
import java.util.Scanner;

public class ebobbulma {

    public static int ebobbulma(int sayi1,int sayi2){
    
    int ebob =1;
    
        for (int i = 1; i <= sayi1 && i<=sayi2; i++) {
            
            if (sayi1%i==0 && sayi2%i==0) {
                
                ebob = i;
            }
        }
    return ebob;
    }
    
    
    
    
    public static void main(String[] args) {
       
        /*ebob bulmak için izlediğim metod:
        1-Önce 2 sayı verildiği için 2 sayıyı kontrol eden bir kod bloğu yazacağım
        (int a, int b)
        2-Bu yazdığım kod bloğunun amacı a ve b sayılarının asallarını bulmak.
        3-mainde a v b sayıların neler olduğunu inputlamak
        
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ebobunu bulmak istediğiniz iki sayıyı giriniz: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Girdiğiniz iki sayının ebobu= "+ ebobbulma(a, b));
        
        
    }
    
}
