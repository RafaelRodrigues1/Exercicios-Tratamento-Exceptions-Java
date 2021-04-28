package exercicio2;

/**
*Fazer um programa para ler os dados de uma conta bancária e depois realizar um
saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta.
* @author RafaelRodrigues1
*/
import java.util.Scanner;
public class Program {
    
    public static void main(String[] args) {
        ContaBancaria cb = null; //Para mitigar a exception em tempo de compilação na linha 39.
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com os dados da conta");
        try{ 
            System.out.print("Número da conta: ");
            int numConta = in.nextInt();
            in.nextLine();
            System.out.print("Nome do titular: ");
            String titular = in.nextLine();
            System.out.print("Saldo inicial: R$");
            double saldo = in.nextDouble();
            System.out.print("Limite de saque: R$");
            double limiteSaque = in.nextDouble();
            cb = new ContaBancaria(numConta, titular, saldo, limiteSaque);
            System.out.print("Valor do saque: R$");
            double saque = in.nextDouble();
            cb.saque(saque);
        }
        catch(ContaBancariaException e){
            System.out.println("Erro no saque" + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Erro inexperado");
            System.exit(0);
        }
        System.out.printf("Novo saldo: R$%.2f\n", cb.getSaldo());
        
    }
}
