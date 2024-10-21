package domain.entities.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("Ladron")
public class Ladron extends Personaje{
  @Column(name ="nivel")
  private Integer nivelSiniestro;
  @Column(name ="tieneAlas",columnDefinition = "BOOLEAN")
  private Boolean tieneNavaja;

  public void atacar(Personaje personaje) {
 //TODO
  }
}
