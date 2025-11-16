package br.fiap.futureskillshub.domain.vo;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class AddressVO {

    @NotBlank
    @Size(max = 100)
    private String street;

    @NotBlank
    @Size(max = 10)
    private String number;

    @NotBlank
    @Size(max = 60)
    private String city;

    @NotBlank
    @Size(max = 2)
    private String state;

    public AddressVO() {}

    public AddressVO(String street, String number, String city, String state) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
    }

    public String fullAddress() {
        return street + ", " + number + " - " + city + "/" + state;
    }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
}