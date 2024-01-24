package pierpaolo.colasante.U5W3D3.adapterPattern;

import lombok.Builder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info info = new Info();
        info.setNome("aldo");
        info.setCognome("Baglio");
        info.setDataDiNascita(LocalDate.of(1967,9,26));

        InfoAdapter infoAdapter = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(infoAdapter);

        System.out.println(userData.getNomeCompleto());
        System.out.println(userData.getEta());
    }
}
