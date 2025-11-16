package br.fiap.futureskillshub.infra.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class IbgeClient {

    private final WebClient client = WebClient.create("https://servicodados.ibge.gov.br/api/v1/localidades");

    @SuppressWarnings("unchecked")
    public List<String> getCities(String uf){
        List<Map<String,Object>> list = client.get()
                .uri("/estados/{uf}/municipios", uf)
                .retrieve()
                .bodyToFlux(List.class)
                .blockFirst();
        if(list == null) return List.of();
        return list.stream().map(m -> (String)((Map)m).get("nome")).collect(Collectors.toList());
    }
}