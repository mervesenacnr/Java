
import java.util.Scanner;

public class faktoriyel2{

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int faktoriyel = 1;
        System.out.print("Sayı giriniz: ");
        int sayi= scanner.nextInt(); 
        int i= 1;
        
        while (i<=sayi){
        
        faktoriyel *= i;
        i++;
    }
    System.out.println("Girdiğiniz sayının faktoriyeli: " +faktoriyel);
}
}