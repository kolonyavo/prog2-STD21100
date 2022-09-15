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
@Table(name = "place")
public class Place implements Serializable {
    @Id
    @Column(name="id_place", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlace;

    @Column(name = "name_place", nullable = false, length = 100)
    private String namePlace;
}
