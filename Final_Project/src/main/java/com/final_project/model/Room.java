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
@Table(name = "room")
public class Room implements Serializable {
    @Id
    @Column(name="id_room", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRoom;

    @Column(name = "name_room", nullable = false, length = 100)
    private String nameRoom;

    @Column(nullable = false)
    private int capacity;
}
