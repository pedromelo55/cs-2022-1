package Ex4;

public class Teste{
    public static void main(String[] args){
        ContaBancaria contaGilmar = new ContaBancaria(1000000.00);

        try{
            contaGilmar.depositar(5000.00);
            contaGilmar.sacar(200000000.00);
        }
        catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }
}