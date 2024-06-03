
package pertemuan3;

public class Toko {
    public static void main (String [] args){
        KueLebaran kue1 = new KueLebaran("Kastengel",5);
        
        
        KueLebaran kue2 = new KueLebaran("Nastar",8);
       
        
        kue1.tampilData();
        kue1.setupdateKueLebaran();
        System.out.println("Stok setelah ditambahkan :"+kue1.getupdateKueLebaran());
    }
}
