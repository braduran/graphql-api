package co.com.graphql;

import co.com.graphql.client.Client;
import co.com.graphql.client.ClientRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ClientController {
    private final ClientRepo clientRepo;

    @QueryMapping
    public List<Client> getClientsByEmail(@Argument String email) {
        return clientRepo.getAllClients();
                /*.stream()
                .filter(u -> u.getEmail().equals(email))
                .findFirst()
                .orElse(new Exception());*/
    }
}
