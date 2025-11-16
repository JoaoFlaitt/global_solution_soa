package br.fiap.futureskillshub.domain.entity;

import br.fiap.futureskillshub.domain.vo.AddressVO;
import br.fiap.futureskillshub.domain.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank 
    @Size(max = 60)
    private String name;

    @Email 
    @NotBlank 
    @Column(unique = true)
    private String email;

    @Embedded
    private AddressVO address;

    @Enumerated(EnumType.STRING)
    private Role role = Role.STUDENT;

    public User() {}

    public User(Long id, String name, String email, AddressVO address, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.role = role;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public AddressVO getAddress() { return address; }
    public void setAddress(AddressVO address) { this.address = address; }
    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
}