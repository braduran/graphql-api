package co.com.graphql.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Client {
    private Integer numeroDocumento;
    private String tipoDocumento;
    private String nombre;
    private Integer saldoTotal;
    private String region;
    private String estadoGestion;
    private String tipificacion;
    private String segmento;
    private String email;
}
