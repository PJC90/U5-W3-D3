package pierpaolo.colasante.U5W3D3.adapterPattern;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class InfoAdapter implements DataSource{
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate dataDiNascita = info.getDataDiNascita();
        LocalDate oggi = LocalDate.now();
        return oggi.minusYears(dataDiNascita.getYear()).getYear();
    }
}
