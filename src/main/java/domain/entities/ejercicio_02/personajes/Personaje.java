package domain.entities.ejercicio_02.personajes;

import domain.entities.ejercicio_01.motivaciones.ConverterMotivacion;
import domain.entities.ejercicio_02.elementos.ConverterElementoDefensor;
import domain.entities.ejercicio_02.elementos.ElementoDefensor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Personaje")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  // Usa Single Table
@DiscriminatorColumn(name = "tipo_personaje")
public class Personaje {

  @javax.persistence.Id
  @GeneratedValue
  private Long Id;

  @Getter
  @ElementCollection
  @CollectionTable(name = "ElementoDefensor")
  @Convert(converter = ConverterElementoDefensor.class)
  @Column(name = "elemento")
  private List<ElementoDefensor> elementos;

  @Getter @Setter
  @Column(name="estamina")
  private Integer estamina;

  @Getter @Setter
  @Column(name="puntosDeVida")
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
  //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }

}
