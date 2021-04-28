package exercicio3;

/**
*Escreva uma classe Contato que contenha nome, telefone e um identificador. 
*Esse identificador deve ser gerado automaticamente pela classe através de um	
*contador(cada vez que um Contato é criado o contador	é incrementado e atribuído
*ao identificador).
*Crie uma classe Agenda que irá funcionar para gerenciar os Contatos. 
*Essa classe precisa de ter um	método para adicionar um Contato e também para consultar. 
*Crie uma classe Teste que informe um menu ao usuário: 
* 1- para consultar um contato da agenda.
* 2 – para adicionar um contato na agenda.
*Se o contato não existir, o programa deve lançar uma exceção de ContatoNaoExisteException.	
*Caso a agenda esteja cheia quando o usuário quiser adicionar um novo contato, 
*o programa deve lançar uma exceção AgendaCheiaExeption. 
*Trate também as exceções de tipo de dados (caso o usuário entre com um tipo de dado invalido).
* @author RafaelRodrigues1
*/
import java.util.Scanner;
public class Program {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao = 0;
        do{
            try{
                System.out.print("1 - Adicionar contato  2 - Consultar contato  0 - Para sair  ");
                opcao = in.nextInt();
                in.nextLine();
                switch (opcao){
                    case 1 -> {
                        System.out.print("Nome: ");
                        String nome = in.nextLine();
                        System.out.print("Telefone: ");
                        String telefone = in.nextLine();
                        try{
                        agenda.addContato(new Contato(nome, telefone));
                        break;
                        }
                        catch(AgendaCheiaExeption e){
                            System.out.println(e.getMessage());
                        }
                    }
                    case 2 -> {
                        System.out.print("Insira id ou nome do contato: ");
                        String consulta = in.nextLine();
                        try{
                            try{
                                int consult = Integer.parseInt(consulta);
                                System.out.println(agenda.consultarNome(consult));
                                break;
                            }
                            catch(NumberFormatException e){                    
                            }
                            System.out.println(agenda.consultarNome(consulta));
                            break;
                        }
                        catch(ContatoNaoExisteException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    case 0 -> {
                        System.out.println("Saindo");
                    }
                    default ->{
                        System.out.println("Opção inválida!");
                    }
                }
            }
            catch(Exception e){
                System.out.println("Erro inesperado.");
                opcao = 0;
            }
        }while(opcao!=0);
    }
}
