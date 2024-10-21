package domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class PruebaPersistencia {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;
}