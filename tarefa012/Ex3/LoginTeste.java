package Ex3;

public class LoginTeste {
    public static void main(String[] args) {
        Login login = new Login("PedroMelo", "AvaliaComCarinho");

        try{
            login.fazer_login("PedroMelo", "PorFavor");
        }
        catch(LoginInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

}
