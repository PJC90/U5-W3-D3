package pierpaolo.colasante.U5W3D3.compositePattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
public class Pagina extends Prodotto{
    private int numeroPagina;
    @Getter
    private String contenuto;



    @Override
    public void print() {
        System.out.println("Pagina numero: " + this.numeroPagina);
        System.out.println(this.contenuto);
    }

    @Override
    public int getNumPagine() {
        return 1;
    }


}
