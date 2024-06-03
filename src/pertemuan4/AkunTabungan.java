package pertemuan4;

public class AkunTabungan extends AkunBank {
    protected double bunga;
 
    public AkunTabungan (String nama,double saldo,double bunga){
        super (nama, saldo);
        this.bunga = bunga;
    }
    public double hitungBunga(){
        return getSaldo()*bunga/100;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Bunga :"+bunga+"%");
    }
}
