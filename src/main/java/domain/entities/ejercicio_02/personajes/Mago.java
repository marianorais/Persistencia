package domain.entities.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("Mago")
public class Mago  extends Personaje{
  @Column(name ="nivel")
  private Integer nivelDeMagia;
  @Column(name ="tieneAlas",columnDefinition = "BOOLEAN")
  private Boolean tieneAlas;

  public void atacar(Personaje personaje) {
 //TODO
  }


}
