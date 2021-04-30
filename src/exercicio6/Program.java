package exercicio6;

import java.util.Scanner;

/**
 *Crie uma classe Login com atributos usuario e senha e um método para verificação.
 *Elabore um teste para cadastro de usuário e senha e depois uma simulação de login.
 *realize o tratamento de excessões para os erros de login.
 * @author RafaelRodrigues1
 */
public class Program {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Cadastro de usuário");
        System.out.print("Insira o login do usuário: ");
        String usuario = in.nextLine();
        System.out.print("Insira a senha: ");
        String senha = in.nextLine();
        Login login = new Login(usuario, senha);
        System.out.println("\nInsira os dados da sua conta");
        System.out.print("Usuário: ");
        usuario = in.nextLine();
        System.out.print("Senha: ");
        senha = in.nextLine();
        try{
            if(login.fazerLogin(usuario, senha)){
                System.out.println("Entrou!");
            }
        }catch(LoginException e){
            System.out.println(e.getMessage());
        }        
    }
}
