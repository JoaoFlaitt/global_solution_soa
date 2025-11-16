package br.fiap.futureskillshub.domain.service;

import br.fiap.futureskillshub.infra.client.IbgeClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IbgeService {

    private final IbgeClient client;

    public IbgeService(IbgeClient client) {
        this.client = client;
    }

    public List<String> getCities(String uf){
        try {
            return client.getCities(uf);
        } catch (Exception e){
            return List.of("Serviço indisponível no momento");
        }
    }
}