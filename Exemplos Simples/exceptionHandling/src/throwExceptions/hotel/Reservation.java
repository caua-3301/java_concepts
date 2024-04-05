package throwExceptions.hotel;

import throwExceptions.main.Main;
import throwExceptions.model.exceptions.DomainExceptions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private int roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(int roomNumber, Date checkIn, Date checkOut) throws DomainExceptions{
        Date today = new Date();

        if (checkIn.before(today) || checkOut.before(today)) {
            throw new DomainExceptions("Datas antes desse momento nao sao permitidas");
        }
        if (checkIn.after(checkOut)) {
            throw new DomainExceptions("A data de saida nao pode ser antes da entrada");
        }

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long durationDate() {
        long diff = checkOut.getTime() - checkIn.getTime();

        return TimeUnit.DAYS.convert(diff, TimeUnit.MICROSECONDS);
    }

    //throws nome da exceção indica que ela será propagada e tratada em outro método da pilha de chamadas
    public void updateDates(Date checkIn, Date checkOut) throws DomainExceptions {
        Date today = new Date();

        if (checkIn.before(today) || checkOut.before(today)) {
            throw new DomainExceptions("Datas antes desse momento nao sao permitidas");
        }
        if (checkIn.after(checkOut)) {
            throw new DomainExceptions("A data de saida nao pode ser antes da entrada");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + ", In " + sdf.format(checkIn) + ", Out " + sdf.format(checkOut) + ", Days " + durationDate();
    }
}
