package pierpaolo.colasante.U5W3D3.adapterPattern;

import lombok.Getter;

@Getter
public class UserData {
    private String nomeCompleto;
    private int eta;
    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
