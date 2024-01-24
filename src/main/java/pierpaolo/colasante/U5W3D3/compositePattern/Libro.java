package pierpaolo.colasante.U5W3D3.compositePattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@AllArgsConstructor
public class Libro extends Prodotto{
    private String titolo;
    private double prezzo;
    private List<String> autori;
    private List<Sezione> capitoli;

    @Override
    public void print() {
        System.out.println("Titolo Libro: " + this.getTitolo());
        this.capitoli.forEach(Sezione::print);
    }

    @Override
    public int getNumPagine() {
        return this.capitoli.stream().mapToInt(Sezione::getNumPagine).sum();
    }
}

