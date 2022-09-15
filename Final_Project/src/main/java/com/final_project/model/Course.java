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
@Table(name = "course")
public class Course implements Serializable {
    @Id
    @Column(name="id_course", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCourse;

    @Column(name = "name_course", nullable = false, length = 100)
    private String nameCourse;
}
