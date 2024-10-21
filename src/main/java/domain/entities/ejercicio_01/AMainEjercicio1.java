package domain.entities.ejercicio_01;

import domain.entities.Repositorio;
import domain.entities.ejercicio_01.motivaciones.BajarDePeso;
import domain.entities.ejercicio_01.motivaciones.Motivacion;

public class AMainEjercicio1 {

  public static void main(String[] args) {

    Repositorio repositorio = new Repositorio();

    //* Crear deportista
    Deportista deportista = new Deportista();
    deportista.setNombre("Juan");
    deportista.setApellido("Pérez");
    deportista.setPesoInicialEnKilos(75.0);
    deportista.agregarContacto("juan.perez@example.com");
    deportista.agregarContacto("+123456789");

    BajarDePeso bajarDePeso = new BajarDePeso();

    deportista.setMotivacionPrincipal(bajarDePeso);
    repositorio.guardar(deportista);

    //* Crear ejercicios
    Ejercicio ejercicio1 = new Ejercicio();
    ejercicio1.setNombre("Correr");
    ejercicio1.setDetalle("Correr 5km a un ritmo moderado");

    repositorio.guardar(ejercicio1);

    Ejercicio ejercicio2 = new Ejercicio();
    ejercicio2.setNombre("Sentadillas");
    ejercicio2.setDetalle("3 series de 12 repeticiones con peso moderado");

    repositorio.guardar(ejercicio2);

    //* Crear día de entrenamiento y agregar ejercicios usando el método personalizado
    DiaDeEntrenamiento dia1 = new DiaDeEntrenamiento();
    dia1.setNumero(1);
    dia1.agregarEjercicio(ejercicio1);
    dia1.agregarEjercicio(ejercicio2);

    repositorio.guardar(dia1);

    DiaDeEntrenamiento dia2 = new DiaDeEntrenamiento();
    dia2.setNumero(2);
    dia2.agregarEjercicio(ejercicio1);
    dia2.agregarEjercicio(ejercicio2);

    repositorio.guardar(dia2);

    //* Crear rutina y agregar días de entrenamiento usando el método personalizado
    Rutina rutina = new Rutina();
    rutina.setDeportista(deportista);
    rutina.agregarDiaDeEntrenamiento(dia1);
    rutina.agregarDiaDeEntrenamiento(dia2);

    repositorio.guardar(rutina);

  }
}
