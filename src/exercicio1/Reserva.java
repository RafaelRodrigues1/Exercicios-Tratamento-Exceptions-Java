package exercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author RafaelRodrigues1
 */
public class Reserva {
    
    private Integer numQuarto;
    private Date checkIn;
    private Date checkOut;

    public static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    public Reserva(Integer numQuarto, Date checkIn, Date checkOut) throws ReservaException{
        if(!checkOut.after(checkIn)){
            throw new ReservaException("A data do Check-Out não pode ser anterior a data do Check-In");
        }
        this.numQuarto = numQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Reserva() {
    }

    public Integer duracao(){
        Long dif = getCheckOut().getTime() - getCheckIn().getTime();
        return (int)TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
    }
    
    public void attReserva(Date checkIn, Date checkOut) throws ReservaException {
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)){
            throw new ReservaException("As datas para renovação de reservas devem ser futuras.");
        }
        if(!checkOut.after(checkIn)){
            throw new ReservaException("A data do Check-Out não pode ser anterior a data do Check-In");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    
    @Override
    public String toString(){
        return "Reserva: Room " + getNumQuarto() +
                ", check-in: " + df.format(getCheckIn()) +
                ", check-out: " + df.format(getCheckOut()) +
                ", " + this.duracao() + " noites";
    }
    
    public Integer getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(Integer numQuarto) {
        this.numQuarto = numQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }
}
