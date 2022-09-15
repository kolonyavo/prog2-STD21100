package com.final_project.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@NoArgsConstructor
@Table(name = "adherent")
public class Adherent implements Serializable {
    @Id
    @Column(name="id_adherent", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdherent;

    @Column(name = "first_name",nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name",nullable = false, length = 100)
    private String lastName;

    @Column(name = "number_phone",nullable = false, length = 20)
    private String numberPhone;

    @Column(name = "email",nullable = false, length = 100)
    private String email;

    @Column(nullable = false)
    private boolean status;

}
