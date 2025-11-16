package br.fiap.futureskillshub.application.controller;

import br.fiap.futureskillshub.application.dto.UserDTO;
import br.fiap.futureskillshub.domain.entity.User;
import br.fiap.futureskillshub.domain.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody @Valid UserDTO dto){
        return ResponseEntity.ok(service.create(dto));
    }

    @GetMapping
    public List<User> list(){
        return service.listAll();
    }
}