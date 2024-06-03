package pertemuan4;

public class Main {
    public static void main(String[]args){
        AkunTabungan akunTabungan = new AkunTabungan ("Alice",5000, 5);
        AkunGiro akunGiro = new AkunGiro("Bob", 2000, 500);
        
        tampilkanInfo (akunTabungan);
        tampilkanInfo (akunGiro);
        
        akunGiro.tarikTunai(1000);
        tampilkanInfo(akunGiro);
        
        System.out.println("Bunga yang didapat :"+ akunTabungan.hitungBunga());
    }
    public static void tampilkanInfo (AkunBank akun){
        akun.info();
    }
}
