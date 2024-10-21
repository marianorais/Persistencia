package domain.entities.ejercicio_02;

import domain.entities.Repositorio;
import domain.entities.ejercicio_02.elementos.Arco;
import domain.entities.ejercicio_02.elementos.Escudo;
import domain.entities.ejercicio_02.elementos.Espada;
import domain.entities.ejercicio_02.personajes.Ladron;
import domain.entities.ejercicio_02.personajes.Mago;


public class AMainEjercicio2 {

  public static void main(String[] args) {
    Repositorio repositorio = new Repositorio();

    Arco arco = new Arco();
    Espada espada = new Espada();
    Escudo escudo = new Escudo();


    Mago maBorda = new Mago();
    maBorda.setNivelDeMagia(10);
    maBorda.setTieneAlas(true);
    maBorda.setEstamina(500);
    maBorda.setPuntosDeVida(100000);
    //* elementos defensores
    maBorda.agregarElemento(escudo);
    maBorda.agregarElemento(espada);
    maBorda.agregarElemento(arco);

    repositorio.guardar(maBorda);

    Ladron ladrILLA = new Ladron();
    ladrILLA.setNivelSiniestro(10);
    ladrILLA.setEstamina(5);
    ladrILLA.setTieneNavaja(false);
    ladrILLA.setPuntosDeVida(-5);
    //* elementos defensores
    ladrILLA.agregarElemento(escudo);
    ladrILLA.agregarElemento(espada);

    repositorio.guardar(ladrILLA);


    Jugador nachoBorda = new Jugador();
    nachoBorda.setApellido("Borda");
    nachoBorda.setNombre("Nacho");
    nachoBorda.setPersonaje(maBorda);

    repositorio.guardar(nachoBorda);

    Jugador nachoVilla = new Jugador();
    nachoVilla.setApellido("Villa");
    nachoVilla.setNombre("Nacho");
    nachoVilla.setPersonaje(ladrILLA);

    repositorio.guardar(nachoVilla);
  }
}
