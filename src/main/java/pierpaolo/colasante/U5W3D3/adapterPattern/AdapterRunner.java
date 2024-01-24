package pierpaolo.colasante.U5W3D3.adapterPattern;

import com.github.javafaker.Faker;
import lombok.Builder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Locale;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Faker fk = new Faker(Locale.ITALY);
        Info info = new Info();
        info.setNome(fk.name().firstName());
        info.setCognome(fk.name().lastName());
        info.setDataDiNascita(LocalDate.of(1961,10,17));

        InfoAdapter infoAdapter = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(infoAdapter);

        System.out.println("****************************************** ADAPTER **********************************");
        System.out.println(userData.getNomeCompleto());
        System.out.println(userData.getEta());
    }
}
