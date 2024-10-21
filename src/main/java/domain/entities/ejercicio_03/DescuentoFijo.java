package domain.entities.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class DescuentoFijo extends Decorado {
@Column(name="nombre")
  private String nombre;
  @Column(name="valor",columnDefinition = "decimal(16,2)")
  private Double valor;

  public Double precio() {
    return this.producto.precio() - this.valor;
  }

  public DescuentoFijo() {

  }
}
