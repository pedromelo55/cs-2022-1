package endereco;

public class Endereco {
    private int numero;
    private String Complemento;
    private int CEP;
    private Bairro bairro;
    private TipoEndereco tipoEndereco;


    public Endereco(int numero, String Complemento, int CEP, Bairro bairro, TipoEndereco tipoEndereco) {
        this.numero = numero;
        this.Complemento = Complemento;
        this.CEP = CEP;
        this.bairro = bairro;
        this.tipoEndereco = tipoEndereco;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public int getCEP() {
        return this.CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public Bairro getBairro() {
        return this.bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }


    public TipoEndereco getTipoEndereco() {
        return this.tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }


}
