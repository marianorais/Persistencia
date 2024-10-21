package domain.entities.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Decorado extends Producto{

  @ManyToOne
  @JoinColumn(name="producto_id",referencedColumnName = "id")
  protected Producto producto;

  public Double precio() {
    return this.producto.precio();
  }
}
