
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
class reservation {

    @Id
    @GeneratedValue
    private Long id;
    private String reservationName;

    @Override
    public String toString() {
        return "A reservation{"
                + "id:" + id
                + ", reservationName='" + reservationName + '\''
                + '}';
    }

    public reservation() {
    }

    public reservation(String reservationName) {
        this.reservationName = reservationName;
    }

    public Long getId() {
        return id;
    }

    public String getReservationName() {
        return reservationName;
    }
}
