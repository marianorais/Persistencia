package domain.entities.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ejercicio")
public class Ejercicio {
    @Id
    @GeneratedValue
    private long id;

    @Column(name="nombre",nullable = false)
    private String nombre;
    @Column(name="detalle",nullable = false)
    private String detalle;
}
