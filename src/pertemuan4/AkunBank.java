package pertemuan4;
//kelas dasar
public class AkunBank {
    private final String nama;
    private double saldo;
    
    public AkunBank(String nama, Double saldo){
        this.nama = nama;
        this.saldo = saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public String getNama(){
        return nama;
    }
    public double getSaldo(){
        return saldo;
    }
    public void info(){
        System.out.println("Nama :"+nama+", Saldo :"+saldo);
    }
}
