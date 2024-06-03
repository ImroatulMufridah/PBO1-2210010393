package pertemuan4;

public class AkunGiro extends AkunBank {
    protected double limit;
    
    public AkunGiro (String nama, double saldo,double limit){
        super (nama, saldo);
        this.limit=limit;
    }
    public void tarikTunai (double jumlah){
        if (jumlah > getSaldo()+limit){
            System.out.println("Saldo tidak mencukupi. termasuk limit");
        }else{
            setSaldo(getSaldo() - jumlah);
            System.out.println("Anda telah menarik tunai sebesar :"+ jumlah);
        }
        
    }
  
    @Override
    public void info(){
        super.info();
        System.out.println ("Limit :"+limit);
    }
}
