package endereco;

import endereco.TipoLogradouro;

public class Logradouro {
    private String nome;
    private TipoLogradouro tipoLogradouro;


    public Logradouro(String nome, TipoLogradouro tipoLogradouro) {
        this.nome = nome;
        this.tipoLogradouro = tipoLogradouro;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoLogradouro getTipoLogradouro() {
        return this.tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

}
