package exercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *Crie uma classe que crie um vetor de inteiros de 10 posições. Feito isso, 
 *permita que o usuário digite valores inteiros a fim de preencher este vetor. 
 *Não implemente nenhum tipo controle referente ao tamanho do vetor, deixe que 
 *o usuário digite valores até que a entrada 0 seja digitada.
 *Uma vez digitado o valor 0, o mesmo deve ser inserido no vetor e a digitação de 
 *novos elementos deve ser interrompida. Feita toda a coleta dos dados, exiba-os em tela.
 * @author RafaelRodrigues1
 */

public class Program {
    
    public static void main(String[] args) {
        
        Integer vect[] = new Integer[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com 10 números, 0 para parar");
        for(int i=0; i!=-1; i++){
            try{
                int c = in.nextInt();
                if(c==0){
                    if(i>=vect.length){
                        vect[vect.length-1]=c;
                    }else{
                        vect[i]= c;
                    }
                    break;
                }
                vect[i]= c;
            }catch(ArrayIndexOutOfBoundsException e){
                in.nextLine();
                i--;
                System.out.println("Já foram inseridos " + vect.length + " números");
            }catch(InputMismatchException e){
                in.nextLine();
                i--;
                System.out.println("Só números inteiros são válidos");
            }
        }                
        try{
            for(int c: vect){
                System.out.print(c + " ");               
            }  
            System.out.println("");
        }catch(NullPointerException e){
            System.out.println("\nVocê não preencheu com " + vect.length + " números");
        }    
    }
}
