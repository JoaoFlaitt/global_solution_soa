package br.fiap.futureskillshub.application.controller;

import br.fiap.futureskillshub.domain.service.IbgeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ibge")
public class IbgeController {

    private final IbgeService service;

    public IbgeController(IbgeService service) {
        this.service = service;
    }

    @GetMapping("/municipios/{uf}")
    public ResponseEntity<List<String>> getMunicipios(@PathVariable String uf){
        return ResponseEntity.ok(service.getCities(uf));
    }
}