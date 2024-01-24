package pierpaolo.colasante.U5W3D3.compositePattern;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Pagina implements Prodotto{
    private int numeroPagina;
    private double prezzo = 10;

    public Pagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    @Override
    public void print() {
        System.out.println("Pagina numero: " + numeroPagina);
    }


}
