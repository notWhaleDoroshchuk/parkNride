package com.example.parknRide.POJO;

import com.example.parknRide.DTO.UserDTO;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;
import java.util.UUID;
public class UsersPojo{
    private UUID id;
    private String email;
    private String password;
    private String name;
    private String surname;
    private String phoneNumber;
    private Instant birthday;

    public void setId(String id) {
        this.id = UUID.fromString(id);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthday(Instant birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "UsersPojo{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
