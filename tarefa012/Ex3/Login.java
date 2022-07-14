package Ex3;
public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Login usuario(String usuario) {
        setUsuario(usuario);
        return this;
    }

    public Login senha(String senha) {
        setSenha(senha);
        return this;
    }

    public boolean fazer_login (String us, String sen) throws LoginInvalidoException{

        if(this.getUsuario().equals(us) && this.getSenha().equals(sen)){
            System.out.println("Deu certo!");
            return true;
        }
        else{
            throw new LoginInvalidoException("Erro: Usuário ou senha não compatível");
        }
    }
}
