package domain.entities.ejercicio_02.elementos;

import domain.entities.ejercicio_01.motivaciones.BajarDePeso;
import domain.entities.ejercicio_01.motivaciones.Mantener;
import domain.entities.ejercicio_01.motivaciones.Motivacion;
import domain.entities.ejercicio_01.motivaciones.Tonificar;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ConverterElementoDefensor implements AttributeConverter<ElementoDefensor, String> {

    @Override
    public String convertToDatabaseColumn(ElementoDefensor elementoDefensor) {
        if (elementoDefensor instanceof Escudo) {
            return "escudo";
        } else if (elementoDefensor instanceof Espada) {
            return "espada";
        }else if (elementoDefensor instanceof Arco) {
            return "arco";
        }
        return null;
    }

    @Override
    public ElementoDefensor convertToEntityAttribute(String s) {
        if ("escudo".equals(s)) {
            return new Escudo();
        } else if ("espada".equals(s)) {
            return new Espada();
        }else if ("arco".equals(s)) {
            return new Arco();
        }
        return null;
    }
}
