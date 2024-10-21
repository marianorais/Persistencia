package domain.entities.ejercicio_02;

import domain.entities.ejercicio_02.personajes.Personaje;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Jugador")
public class Jugador {
  @javax.persistence.Id
  @GeneratedValue
  private Long Id;
  @Column(name="nombre")
  private String nombre;
  @Column(name="apellido")
  private String apellido;
  @Column(name="fechaAlta",columnDefinition = "datetime")
  private LocalDate fechaAlta;
  @ManyToOne
  @JoinColumn(name = "personaje_id",referencedColumnName = "id")
  private Personaje personaje;

  public Jugador() {
    this.fechaAlta = LocalDate.now();
  }

  public void cambiarPersonaje(Personaje personaje) {
    this.personaje = personaje;
  }
}
