package domain.entities.ejercicio_01;

import domain.entities.ejercicio_01.motivaciones.ConverterMotivacion;
import domain.entities.ejercicio_01.motivaciones.Motivacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "deportista")
public class Deportista {
    @Id
    @GeneratedValue
    private long id;

    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;

    @ElementCollection
    @CollectionTable(name = "contacto", joinColumns = @JoinColumn(name = "deportista_id"))
    @Column(name="contacto")
    private List<String> contactos;

    @Convert(converter = ConverterMotivacion.class)
    @Column(name = "motivacion")
    private Motivacion motivacionPrincipal;

    @Column(name="peso")
    private Double pesoInicialEnKilos;

    public void agregarContacto(String contacto) {
        contactos.add(contacto);
    }

    public Deportista(){
        this.contactos = new ArrayList<>();
    }

}
