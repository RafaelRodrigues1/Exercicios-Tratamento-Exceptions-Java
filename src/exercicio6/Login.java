package exercicio6;

/**
 * @author RafaelRodrigues1
 */
public class Login {
    
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public boolean fazerLogin(String usuario, String senha) throws LoginException{
        if(this.usuario.equals(usuario) && this.senha.equals(senha)){
        return true;
        }else if(!this.usuario.equals(usuario)){
            throw new LoginException("Usuário inválido");
        }else{
            throw new LoginException("Senha incorreta");
        }
       
    }
}
