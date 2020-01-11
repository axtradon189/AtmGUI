package bank;

public class MiniDatabase extends ATM {
    protected static double saldo = 500000;
    /*public MiniDatabase(double nHasil, String nAnswer, double nSaldo, int nMasukan){
        this.hasil=nHasil;
        this.answer=nAnswer;
        this.saldo=nSaldo;
        this.masukan=nMasukan;
    }*/
    public void addSaldo(int newMasukan){
        saldo= newMasukan+saldo;
    }
}
