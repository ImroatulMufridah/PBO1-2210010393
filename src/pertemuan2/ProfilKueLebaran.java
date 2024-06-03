/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author TOMS
 */
public class ProfilKueLebaran {
        public static void main(String[] args){
        KueLebaran nastar = new KueLebaran ();
        KueLebaran kastengel = new KueLebaran ();
        KueLebaran kastenge3 = new KueLebaran ();
        
        nastar.Atas_Nama = "Rika";
        nastar.Ukuran = "200gr";
        nastar.Harga = 50000;
        
        kastengel.Atas_Nama = "Mima";
        kastengel.Ukuran = "400gr";
        kastengel.Harga = 95000;
        
        System.out.println("Atas_nama   : "+ nastar.Atas_Nama);
        System.out.println("Ukuran      : "+ nastar.Ukuran);
        System.out.println("Harga       : "+ nastar.Harga);
        System.out.println("");
        
        System.out.println("Atas_nama   : "+ kastengel.Atas_Nama);
        System.out.println("Ukuran      : "+ kastengel.Ukuran);
        System.out.println("Harga       : "+ kastengel.Harga);
    }
    
}
