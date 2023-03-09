package com.barberia.barberia.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Entity
@Table(name = "barberia")
public class UsuarioModel {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable = false)
    private long id;

    @Getter
    @Setter
    private String nombre;

    @Getter
    @Setter
    private String horario;

    @Getter
    @Setter
    private String servicio;

    @Getter
    @Setter
    private int precio;

    @Getter
    @Setter
    private Integer prioridad;
}
