package domain.entities.ejercicio_01.motivaciones;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ConverterMotivacion implements AttributeConverter<Motivacion, String> {

    @Override
    public String convertToDatabaseColumn(Motivacion tipo) {
        if (tipo instanceof Mantener ) {
            return "mantener";
        } else if (tipo instanceof BajarDePeso ) {
            return "bajarPeso";
        }else if (tipo instanceof Tonificar ) {
            return "tonificar";
        }
        return null;
    }

    @Override
    public Motivacion convertToEntityAttribute(String dbData) {
        if ("mantener".equals(dbData)) {
            return new Mantener();
        } else if ("bajarPeso".equals(dbData)) {
            return new BajarDePeso();
        }else if ("tonificar".equals(dbData)) {
            return new Tonificar();
        }
        return null;
    }
}