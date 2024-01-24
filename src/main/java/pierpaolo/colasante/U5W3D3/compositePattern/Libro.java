package pierpaolo.colasante.U5W3D3.compositePattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    private double prezzo;
    private List<Autore> autoreList = new ArrayList<>();
    private List<Prodotto> sezioni = new ArrayList<>();
    public void print() {
        System.out.println("Libro: ");
        for(Prodotto prodotto : sezioni){
            prodotto.print();
        }
    }
}
