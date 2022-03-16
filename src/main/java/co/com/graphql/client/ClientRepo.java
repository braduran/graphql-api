package co.com.graphql.client;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientRepo {

    public List<Client> getAllClients(){
        return List.of(new Client(1, "NIT", "Olimpica S.A", 123000,
                "Antioquia", "por gestionar", "ingreso", "pyme", "bdurango@bancolombia.com.co"),
                new Client(2, "NIT", "Tiendas D1", 550000,
                        "Caribe", "gestionado", "mantener", "empresarial", "yburbano@bancolombia.com.co"));
    }
}
