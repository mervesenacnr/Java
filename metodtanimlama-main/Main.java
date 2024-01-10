public class Main {

    public static void main(String[] args) {
        
        Araba araba1 = new Araba();
        
        araba1.renk= "kırmızı";
        araba1.marka="Ferrari";
        araba1.setKisiadi("Merve");
        araba1.setKisiadi("Cemile"); 
        /*
        ekrana bu araç yalnızca Merve'ye aittir yazdırır.
        yorum satırlarından 2.soruya git.
        */
        
        
        System.out.println( araba1.renk+" "+araba1.marka);
        System.out.println("Arabanın sahibi: " +araba1.getKisiadi());
    }
    
}

/*
1-Neden metod kullanırız?
Bazı kodların kişiler tarafından görünmesini istemediğimizde kullanabiliriz.

2-Neden public yerine private kullanırız?
Objelerimizi özelleştirebilmek için. Mesela bir objeye x değerinin verilmesini istemiyorsak
bunun olmaması için fonksiyon yazabiliriz.

3-Classlardaki objeler neden private olmalı?
referanslar başka bir dosya içerisine tanımlanmış objeleri çağırır (referans ör: araba1)

4- N Capsulation nedir?
classımıza metodlarımızı ekleriz, metodlarımız public olacak 
ve metodlarımız classımızın içinde olacağı için direkt olarak bu private alanlara erişebilecek

5-Java'da özelliklerin değerini almak için hangi anahtar kelimeleri kullanırız?
setter, getter

6-Her seferinde tek tek yazmamak için hangi yöntemi kullanırız?
dosyanın üzerine sağ tık -> refactor -> encapsulate fields -> yazmak istediğimiz  objeleri işaretleriz

7- Erişim belirleyiciler nelerdir?
private,protected,public

8-Object oriented nedir?
gerçek hayatı programlama dünyasına kodlamaya denir.

9-Referanslar objesiz çalışırz mı?
Çalışmaz, referans oluşturuluyorsa, objesi olmalıdır.

10-"null" anahtar kelimesi ne için kullanılır?
referansın herhangi bir objede henüz kullanılmadığını gösterir. Ancak bu şekilde objesiz referans oluşturulur.
*/