package exercicio1;

/**
* Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data
de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em
dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
novamente a reserva com os dados atualizados. O programa não deve aceitar dados
inválidos para a reserva, conforme as seguintes regras:
- Alterações de reserva só podem ocorrer para datas futuras
- A data de saída deve ser maior que a data de entrada
* @author RafaelRodrigues1
*/
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

    public static void main(String[] args) {
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Scanner in = new Scanner(System.in);
        System.out.print("Número do quarto: ");
        int numQuarto = in.nextInt();
        try{
        System.out.print("Data do check-in(DD/MM/YYYY): ");
        Date checkIn = df.parse(in.next());
        System.out.print("Data do check-out(DD/MM/YYYY): ");
        Date checkOut = df.parse(in.next());
        Reserva reserva = new Reserva(numQuarto, checkIn, checkOut);
        System.out.println(reserva);
        
        System.out.println("Entre com os dados de renovação de reserva:");
        System.out.print("Data do check-in(DD/MM/YYYY): ");
        checkIn = df.parse(in.next());
        System.out.print("Data do check-out(DD/MM/YYYY): ");
        checkOut = df.parse(in.next());
        reserva.attReserva(checkIn, checkOut);
        System.out.println(reserva);
        }
        catch(ParseException | ReservaException e){
            System.out.println(e.getMessage());
        }
    }
    
}
