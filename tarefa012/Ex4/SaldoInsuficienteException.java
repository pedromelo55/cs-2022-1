package Ex4;

public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}