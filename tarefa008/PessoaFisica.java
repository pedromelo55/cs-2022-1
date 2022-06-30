package endereco;

public class PessoaFisica {
    private String nome;
    private String sexo;
    private String dataNascimento;
    private Endereco enderco;


    public PessoaFisica(String nome, String sexo, String dataNascimento, Endereco enderco) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.enderco = enderco;
    }
    
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEnderco() {
        return this.enderco;
    }

    public void setEnderco(Endereco enderco) {
        this.enderco = enderco;
    }
   

}
