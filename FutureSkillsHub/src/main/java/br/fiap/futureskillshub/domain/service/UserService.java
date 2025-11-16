package br.fiap.futureskillshub.domain.service;

import br.fiap.futureskillshub.application.dto.UserDTO;
import br.fiap.futureskillshub.domain.entity.User;
import br.fiap.futureskillshub.domain.vo.AddressVO;
import br.fiap.futureskillshub.infra.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    @Transactional
    public User create(UserDTO dto) {
        AddressVO address = new AddressVO(
                dto.street(),
                dto.number(),
                dto.city(),
                dto.state()
        );

        User user = new User();
        user.setName(dto.name());
        user.setEmail(dto.email());
        user.setAddress(address);
        user.setRole(dto.role() != null ? dto.role() : br.fiap.futureskillshub.domain.enums.Role.STUDENT);

        return repo.save(user);
    }

    public List<User> listAll(){
        return repo.findAll();
    }
}