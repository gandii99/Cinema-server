package howtoexitvim.cinemaserverproject.configuration;

import howtoexitvim.cinemaserverproject.show.Show;
import howtoexitvim.cinemaserverproject.show.ShowService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;


@Configuration
public class CinemaConfig {

    @Bean
    CommandLineRunner commandLineRunner(ShowService showService) {

        return args -> {
            Show show1 = new Show("AVENGERS: CZAS ULTRONA", 142, LocalDateTime.of(2021, 6, 25, 18, 0), "Najpotężniejsi bohaterowie na Ziemi łączą swoje siły, aby zniszczyć Ultrona.", "Joss Whedon", "Joss Whedon", "Akcja / Sci-Fi", "USA", "13 kwietnia 2015(świat)", 7.2f, 6.4f, "picture_avengers_czas_ultrona_13_kwietnia_2015", "https://www.youtube.com/embed/tmeOjFno6Do");
            Show show2 = new Show("LIGA SPRAWIEDLIWOŚCI ZACKA SNYDERA", 242, LocalDateTime.of(2021, 30, 2, 12, 0), "Bruce Wayne, chcąc mieć pewność, że poświęcenie Supermana nie poszło na marne, łączy siły z Dianą Prince, by zwerbować zespół superbohaterów, którzy ochronią świat przed zbliżającym się niebezpieczeństwem.", "Zack Snyder", "Chris Terrio", "Akcja / Sci-Fi", "USA", "18 marca 2021 (świat)", 7.1f, 4.8f, "picture_liga_sprawiedliwosci_zacka_snydera_18_marca_2021", "https://www.youtube.com/embed/vM-Bja2Gy04");
            Show show3 = new Show("SALA SAMOBÓJCÓW. HEJTER", 142, LocalDateTime.of(2021, 6, 28, 14, 50), "Wydalony z Uniwersytetu Warszawskiego student prawa, zostaje przyłapany na plagiacie. Postanawia jednak ukrywać ten fakt przed światem i nadal pobiera pomoc finansową od państwa Krasuckich.", "Jan Komasa", "Mateusz Pacewicz", "Thriller", "Polska", "5 marca 2020 (świat)", 7.0f, 6.9f, "picture_sala_samobojcow_hejter_5_marca_2020", "https://www.youtube.com/embed/1J-90nGlzBE");
            Show show4 = new Show("W STREFIE WOJNY", 114, LocalDateTime.of(2021, 6, 4, 27, 00), "W niedalekiej przyszłości pilot dronów udaje się do strefy wojny u boku ściśle tajnego żołnierza-androida. Razem mają powstrzymać atak nuklearny.", "Mikael Håfström", "Rowan Athale / Rob Yescombe", "Akcja / Sci-Fi", "USA", "15 stycznia 2021 (świat)", 8.2f, 5.4f, "picture_w_strefie_wojny_15_stycznia_2021", "https://www.youtube.com/embed/XHOjg7I1p4o");

            showService.addShow(show1);
            showService.addShow(show2);
            showService.addShow(show3);
            showService.addShow(show4);
        };

    }

}


