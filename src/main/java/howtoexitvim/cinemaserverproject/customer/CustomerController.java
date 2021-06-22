package howtoexitvim.cinemaserverproject.customer;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    /** Metoda która rezerwuje bilet na dany seans, na dane konkretnego klienta
     *
     * @param customer obiekt klasy Customer
     * @param seats numer miejsca które zostało zarezerwowane
     * @param showId id seansu na który rezerwujemy miejsce
     */
    @PostMapping()
    public void bookSeats(@RequestBody Customer customer,
                          @RequestParam("seats") String seats,
                          @RequestParam("showId") Long showId) {
        customerService.bookSeats(customer, seats, showId);
    }
}
