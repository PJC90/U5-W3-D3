package pierpaolo.colasante.U5W3D3.compositePattern;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pierpaolo.colasante.U5W3D3.adapterPattern.Info;
import pierpaolo.colasante.U5W3D3.adapterPattern.InfoAdapter;
import pierpaolo.colasante.U5W3D3.adapterPattern.UserData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Faker fk = new Faker(Locale.ITALY);
        Libro libro = new Libro();
        Autore autore = new Autore(fk.name().fullName());
        List<Prodotto> listP = new ArrayList<>();
        listP.add(new Pagina(1));
        Pagina pagina2 = new Pagina(2);
        Sezione sezione = new Sezione();
        sezione.getSezioni().add(pagina2);
        sezione.setTitoloSezione("Sezione 1");
        listP.add(sezione);
        libro.setSezioni(listP);
        libro.print();
    }
}
