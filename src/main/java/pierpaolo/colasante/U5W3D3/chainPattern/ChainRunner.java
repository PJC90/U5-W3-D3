package pierpaolo.colasante.U5W3D3.chainPattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pierpaolo.colasante.U5W3D3.compositePattern.CompositeRunner;
@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("****************************************** CHAIN **********************************");
        Generale generale = new Generale();
        Colonnello colonnello = new Colonnello();
        Tenente tenente = new Tenente();
        Maggiore maggiore = new Maggiore();
        Capitano capitano = new Capitano();

        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(tenente);
        tenente.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        capitano.doCheck(555);
    }
}
