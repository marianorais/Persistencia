package domain.entities.ejercicio_01.motivaciones;

import domain.entities.ejercicio_01.Deportista;
import domain.entities.ejercicio_01.Rutina;

public interface Motivacion {
    public Rutina generarRutinaPara(Deportista deportista);
}
