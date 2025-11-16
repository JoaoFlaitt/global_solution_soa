package br.fiap.futureskillshub.infra.repository;

import br.fiap.futureskillshub.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }