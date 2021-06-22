package howtoexitvim.cinemaserverproject.show;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("api/shows")
public class ShowController {

    private final ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    /*
     * metoda dodająca seans do bazy danych
     *
     * @param show obiekt klasy Show
     */
    @PostMapping
    public void addShow(@RequestBody Show show) {
        showService.addShow(show);
    }

    /**
     * metoda zwraca wszystkie seansy z bazy danych
     *
     * @return Lista obiektów klasy Show
     */
    @GetMapping
    public List<Show> getShows() {
        return showService.getShows();
    }


    /**
     * metoda zwraca listę wolnych miejsc na dany seans, jako parametr przyjmuje id seansu
     *
     * @param showId id seansu
     * @return lista wolnych miejsc na dany seans
     */
    @GetMapping("/{showId}/freeSeats")
    public Map<String, List<String>> getShow(@PathVariable("showId") Long showId) {
        return showService.getShow(showId);
    }

    /**
     * zwraca listę z informacjami o danym seansie, jako parametr przyjmuje id seansu
     *
     *
     * @param showId id seansu
     * @return lista z informacjami o danym seansie
     */
    @GetMapping("/{showId}")
    public List<Show> getShowInfo(@PathVariable("showId") Long showId) {
        return showService.getShowsInfo(showId);
    }

}
