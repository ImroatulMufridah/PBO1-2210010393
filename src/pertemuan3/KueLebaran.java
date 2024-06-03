
package pertemuan3;

public class KueLebaran {
    String nama;
    int stok;
    
KueLebaran (String nama, int stok){
    this.nama = nama;
    this.stok = stok;
}

void setupdateKueLebaran(){
        stok = stok+10;
        }
int getupdateKueLebaran(){
        return stok;
        }
void tampilData(){
    System.out.println ("Nama   :"+nama);
    System.out.println ("Stok   :"+stok);
    
    
}
}
