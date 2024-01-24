package pierpaolo.colasante.U5W3D3.compositePattern;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sezione implements Prodotto{
    private String titoloSezione;
    private List<Prodotto> sezioni = new ArrayList<>();


    @Override
    public void print() {
        System.out.println("Sezione: " + sezioni);
        for(Prodotto prodotto : sezioni){
            prodotto.print();
        }
    }


}
