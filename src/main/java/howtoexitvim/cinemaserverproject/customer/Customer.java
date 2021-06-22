package howtoexitvim.cinemaserverproject.customer;

import howtoexitvim.cinemaserverproject.seat.Seat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * W tej klasie znajdują sie podstawowe parametry opisujące klienta
 */
@Getter
@Setter
@NoArgsConstructor
@Table(name= "customer")
@Entity(name="Customer")
public class Customer {

    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_sequence")
    @Column(name = "id_customer", nullable = false)
    private Long idCustomer;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone_number", nullable = false, length = 11)
    private String phoneNumber;

    @OneToMany(cascade=CascadeType.ALL)
    private List<Seat> seats = new ArrayList<>();

}
