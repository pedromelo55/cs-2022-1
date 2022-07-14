package Ex4;

public class ContaBancaria {
    private Double saldo; 


    public ContaBancaria(Double saldo) {
        this.saldo = saldo;
    }
    

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double val){
        this.saldo += val;
        System.out.println("\nNovo saldo: " + this.saldo);
    }

    public void sacar(Double val) throws SaldoInsuficienteException{
        if(val <= this.getSaldo()){
            this.saldo -= val;
            System.out.println("\nSaque realizado!");
        }
        else{
            throw new SaldoInsuficienteException("\nErro: valor maior do que saldo");
        }
    }
}
