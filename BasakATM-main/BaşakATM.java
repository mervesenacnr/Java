
import java.util.Scanner;


public class BaşakATM {

/*
    Merhaba, java ile ATM programı projeme hoşgeldiniz. 😁✨✨
    Bu programda şunları yapabiliyor olacağız:
    ⭐Banka hesabımızın şifresini girebilme
    ⭐Kişisel bilgilerimizi görüntüleme
    ⭐Para çekme
    ⭐Para yatırma
    ⭐Para gönderme
    ⭐Çıkış yapma "q"
    
    
    */  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int bakiye1 = 1000;
        int bakiye2= 16506;
        
        System.out.println("Başak ATM'ye hoş geldiniz!");
        System.out.println("Lütfen şifrenizi giriniz..."); 
        
        /*Bu programda kayıtlı 2 banka hesabı vardır:
        1.Hesap: Merve (şifre:1234)
        2.Hesap: Sena (şifre:4321)
         
        IBAN: 
        banka1: 1000
        banka2: 2000
                    
        */
        
       String sifre = scanner.nextLine();
       //şifreyi sisteme int olarak girememe sebebimiz: if/equals fonksiyonun string ile çalışır
        
        switch (sifre) {
            case "1234":
                {
                    System.out.println("Hoş geldiniz Merve Hanım.");
                    String islemler = "1.İşlem: Bakiye Öğrenme\n"
                            +"2.İşlem: Para çekme\n"
                            +"3.İşlem: Para yatırma\n"
                            +"4.İşlem: Para gönderme\n"
                            +"5.İşlem: Kişisel bilgilerim\n"
                            +"6.İşlem: Hesap değiştir\n"
                            +"Çıkış: q ";
                    System.out.println("****************************");
                    System.out.println(islemler);
                    System.out.println("****************************");
            OUTER_1:
            while (true) {
                System.out.print("Lütfen işlem seçiniz:");
                String islem = scanner.nextLine();
                switch (islem) {
                    case "1":
                        System.out.println("Bakiyeniz: "+bakiye1 + "TL");
                        break;
                    case "2":
                        System.out.println("Çekmek istediğiniz tutarı giriniz:");
                        int cekme =scanner.nextInt();
                        scanner.nextLine();
                        if (bakiye1 - cekme < 0) {
                            System.out.println("Yeterli bakiyeniz yok. Bakiyeniz: "+bakiye1);
                        }
                        
                        else{
                            bakiye1 -= cekme;
                            System.out.println("Çektiğiniz tutar:\n " +cekme+" TL "
                                    + "Bakiyeniz: "+bakiye1+ "TL" );
                        }
                        break;
                    case "3":
                        System.out.println("Yatırmak istediğiniz tutarı giriniz:");
                        int yatırma =scanner.nextInt();
                        scanner.nextLine();
                        bakiye1+= yatırma;
                        System.out.println("Yatırdığınız tutar:\n" +yatırma+" TL "
                                + "Bakiyeniz: "+bakiye1+ "TL");
                        break;
                    case "4":
                        /*
                        bu programa kayıtlı 2 banka hesabı ve 2 iban bulunmaktadır:
                        banka1: 1000
                        banka2: 2000
                        */
                        System.out.println("Para yatırmak istediğiniz...\n"
                                +"IBAN'ın son 4 hanesi ve hesap adını giriniz:");
                        System.out.print("IBAN'ın son 4 hanesi:");
                        String iban =scanner.nextLine();
                        System.out.print("Hesap adının baş harfini giriniz:");
                        String ad =scanner.nextLine();
                        if (iban.equals("2000")|| ad.equals("S")) {
                            System.out.print("Sena Hanımın banka hesabına göndermek istediğiniz tutarı giriniz: ");
                            int gonder = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Gönderdiğiniz tutar: "+gonder+" TL");
                            bakiye1 -= gonder;
                            bakiye2 += gonder;
                        }
                        else {
                            System.out.println("Eksik veya yanlış bilgi girdiniz. Lütfen tekrar deneyiniz...");
                        }
                        break;
                    case "5":
                        System.out.println("Kişisel bilgileriniz:\n "
                                +"İsim Soyisim: Merve Çınar\n "
                                +"Yaş: 22\n"
                                +"Adres: İzmir\n"
                                +"TC: 10000000000");
                        break;
                    case "6":
                        
                        System.out.println("Lütfen şifrenizi giriniz..."); 
                        String sifree = scanner.nextLine();
                        
                        if (sifree.equals("4321")) {
                            
                            System.out.println("Hoş geldiniz Sena Hanım.");
                    String islemlerr = "1.İşlem: Bakiye Öğrenme\n"
                            +"2.İşlem: Para çekme\n"
                            +"3.İşlem: Para yatırma\n"
                            +"4.İşlem: Para gönderme\n"
                            +"5.İşlem: Kişisel bilgilerim\n"
                            +"Çıkış: q ";
                    System.out.println("****************************");
                    System.out.println(islemlerr);
                    System.out.println("****************************");
            OUTER:
            while (true) {
                System.out.print("Lütfen işlem seçiniz:");
                String islemm = scanner.nextLine();
                switch (islemm) {
                    case "1":
                        System.out.println("Bakiyeniz: "+bakiye2 + "TL");
                        break;
                    case "2":
                        System.out.println("Çekmek istediğiniz tutarı giriniz:");
                        int cekmee =scanner.nextInt();
                        scanner.nextLine();
                        if (bakiye2 - cekmee < 0) {
                            System.out.println("Yeterli bakiyeniz yok. Bakiyeniz: "+bakiye2);
                        }
                        
                        else{
                            bakiye1 -= cekmee;
                            System.out.println("Çektiğiniz tutar:\n " +cekmee+" TL "
                                    + "Bakiyeniz: "+bakiye2+ "TL" );
                        }
                        break;
                    case "3":
                        System.out.println("Yatırmak istediğiniz tutarı giriniz:");
                        int yatırmaa =scanner.nextInt();
                        scanner.nextLine();
                        bakiye1+= yatırmaa;
                        System.out.println("Yatırdığınız tutar:\n" +yatırmaa+" TL "
                                + "Bakiyeniz: "+bakiye2+ "TL");
                        break;
                    case "4":
                        /*
                        bu programa kayıtlı 2 banka hesabı ve 2 iban bulunmaktadır:
                        banka1: 1000
                        banka2: 2000
                        */
                        
                        System.out.println("Para yatırmak istediğiniz...\n"
                                +"IBAN'ın son 4 hanesi ve hesap adını giriniz:");
                        System.out.print("IBAN'ın son 4 hanesi:");
                        String ibann =scanner.nextLine();
                        System.out.print("Hesap adının baş harfini giriniz:");
                        String add =scanner.nextLine();
                        if (ibann.equals("1000")|| add.equals("M")) {
                            System.out.print("Sena Hanımın banka hesabına göndermek istediğiniz tutarı giriniz: ");
                            int gonder = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Gönderdiğiniz tutar: "+gonder+" TL");
                            bakiye2 -= gonder;
                            bakiye1 += gonder;
                        }
                        else {
                            System.out.println("Eksik veya yanlış bilgi girdiniz. Lütfen tekrar deneyiniz...");
                        }
                        break;
                    case "5":
                        System.out.println("Kişisel bilgileriniz:\n "
                                +"İsim Soyisim: Sena Çınar\n "
                                +"Yaş: 32\n"
                                +"Adres: İzmir\n"
                                +"TC: 10000000000");
                        break;
                    case "q":
                        System.out.println("Sistemden çıkış yapılıyor...");
                        break OUTER;
                    default:
                        break;
                }
            }
                            
                            
                        }
                        else if (sifree.equals("1234")) {
                            System.out.println("Merve Hanım tekrardan hesabınıza hoş geldiniz...");
                            System.out.println("Herhangi bir işlem yapılamayacağı için program sonlandırılıyor...");
                            break;
                            
                        }
                        else{
                        System.out.println("Bu şifreye ait banka hesabı bulunmamaktadır...");}  
                        break;
                        
                    case "q":
                        System.out.println("Sistemden çıkış yapılıyor...");
                        break;
                    
                    default:
                        break;
                }
            }

                }
          
                }
            
        }
            
        }    
        
   
 

