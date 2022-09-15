package com.final_project.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@NoArgsConstructor
@Table(name = "sessionss")
public class Session implements Serializable {
    @Id
    @Column(name="id_sessionss", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSession;

    @Column
    private Date startTime;

    @Column
    private Date endTime;

}
