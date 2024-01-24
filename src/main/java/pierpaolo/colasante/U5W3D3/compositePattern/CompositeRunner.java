package pierpaolo.colasante.U5W3D3.compositePattern;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pierpaolo.colasante.U5W3D3.adapterPattern.Info;
import pierpaolo.colasante.U5W3D3.adapterPattern.InfoAdapter;
import pierpaolo.colasante.U5W3D3.adapterPattern.UserData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Faker fk = new Faker(Locale.ITALY);
        System.out.println("********************************* COMPOSITE ******************************");
        Pagina p1 = new Pagina(1,fk.gameOfThrones().quote());
        Pagina p2 = new Pagina(2,fk.gameOfThrones().quote());
        Pagina p3 = new Pagina(3,fk.gameOfThrones().quote());
        Pagina p4 = new Pagina(4,fk.gameOfThrones().quote());
        Pagina p5 = new Pagina(5,fk.gameOfThrones().quote());
        Pagina p6 = new Pagina(6,fk.gameOfThrones().quote());
        Pagina p7 = new Pagina(7,fk.gameOfThrones().quote());
        Pagina p8 = new Pagina(8,fk.gameOfThrones().quote());


        Sezione sottocapitolo1 = new Sezione("sezione 1", Arrays.asList(p1, p2));
        Sezione sottocapitolo2 = new Sezione("sezione 2", Arrays.asList(p3, p4));
        Sezione sottocapitolo3 = new Sezione("sezione 3", Arrays.asList(p5, p6));
        Sezione sottocapitolo4 = new Sezione("sezione 4", Arrays.asList(p5, p6));

        Sezione capitolo1 = new Sezione("capitolo1", Arrays.asList(sottocapitolo1, sottocapitolo2));
        Sezione capitolo2 = new Sezione("capitolo2", Arrays.asList(sottocapitolo3, sottocapitolo4));

        Libro libro = new Libro(fk.harryPotter().book(),35, Arrays.asList(fk.harryPotter().character(),fk.harryPotter().character()), Arrays.asList(capitolo1, capitolo2));
        libro.print();
        System.out.println("Il libro " + libro.getTitolo() + " ha " + libro.getNumPagine() + " pagine");





    }
}
