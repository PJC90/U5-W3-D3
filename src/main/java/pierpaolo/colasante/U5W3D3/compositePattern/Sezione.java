package pierpaolo.colasante.U5W3D3.compositePattern;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Sezione extends Prodotto{
    private String titoloSezione;
    private List<Prodotto> componenti;


    @Override
    public void print() {
        System.out.println(this.titoloSezione.toUpperCase());
        this.componenti.forEach(Prodotto::print);
        }


    @Override
    public int getNumPagine() {
        return this.componenti.stream().mapToInt(Prodotto::getNumPagine).sum();
    }


}
