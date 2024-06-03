package uts;

public class Mahasiswa extends Orang {
    
    protected String nim;
    protected String jurusan;

public Mahasiswa (String nama, int umur, String nim, String jurusan){
   super (nama,umur);
   this.nim = nim;
   this.jurusan = jurusan;
}
    public String getNim(){
        return nim;
    }
    public void setNim (String nim){
        this.nim = nim;
    }
     public String getJurusan(){
        return jurusan;
    }
    public void setJurusan (String jurusan){
        this.jurusan = jurusan;   
    }
@Override
    public void perkenalan(){
        System.out.println("Halo, nama saya " + getNama() + " dan saya berumur " + getUmur() +" tahun." + 
                "NIM saya " + nim + " dan saya dari jurusan " + jurusan +".");
    }
}
