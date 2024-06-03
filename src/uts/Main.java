package uts;

public class Main {
    public static void main (String [] args){
        Orang orang1 = new Orang ("Ina",20);
        orang1.perkenalan ();
        
        Mahasiswa mahasiswa1 = new Mahasiswa ("Ima",21,"2210010345","Teknik Informatika");
        mahasiswa1.perkenalan();
    
        Orang orangMahasiswa = new Mahasiswa("Cia",19,"23444758","Manajemen");
        orangMahasiswa.perkenalan();
    }
}
