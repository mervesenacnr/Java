public class Araba {
    
    public String renk;
    public String marka;
    private String kisiadi;
    
    public void setKisiadi(String kisiadi){
    
        
        if (!"Merve".equals(kisiadi)) {
            System.out.println("Bu araç yalnızca Merve'ye aittir.");
        }
        else{
        this.kisiadi = kisiadi; //objenin kendisine ulaşmak istersek " this." anahtar kelimesini kullanırız
        }
    
    }
    
       public String getKisiadi(){
           return kisiadi;
       }     
       //bu yöntemle private alanımıza erişebiliyoruz ve metod sayesinde değer elde edebiliyoruz.
}

