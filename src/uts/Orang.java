package uts;

public class Orang {
   protected String nama; 
   protected int umur;
   
   public Orang (String nama, int umur){
   this.nama = nama;
   this.umur = umur;
   }
   
   public String getNama (){
       return nama;  
   }
   public int getUmur (){
       return umur;
   }
   
   public void setNama(String nama){
       this.nama = nama;
   }
   public void setUmur (int umur){
       this.umur = umur;
   }
   public void perkenalan(){
       System.out.println("Halo, nama saya " + nama + " dan saya berumur " + umur +" tahun");
   }
}
