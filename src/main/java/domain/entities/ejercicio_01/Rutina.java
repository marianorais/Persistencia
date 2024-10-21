package domain.entities.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "rutina")
public class Rutina {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name="deportista_id",referencedColumnName="id")// Columna en la tabla Rutina
    private Deportista deportista;

    @OneToMany
    @JoinColumn(name = "rutina_id") // Columna en la tabla DiaDeEntrenamiento que contiene el id de Rutina
    private List<DiaDeEntrenamiento> diasDeEntrenamiento;

    @ManyToOne
    @JoinColumn(name="rutinaAnterior_id",referencedColumnName="id")
    private Rutina rutinaAnterior;

    public Rutina() {
        this.diasDeEntrenamiento = new ArrayList<>();
    }

    public void agregarDiaDeEntrenamiento(DiaDeEntrenamiento diaDeEntrenamiento) {
        this.diasDeEntrenamiento.add(diaDeEntrenamiento);
    }
}
