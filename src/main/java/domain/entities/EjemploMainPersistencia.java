package domain.entities;

public class EjemploMainPersistencia {
    
    public static void main(String[] args) {

        PruebaPersistencia prueba = new PruebaPersistencia();
        prueba.setNombre("ejemplo");

        Repositorio repositorio = new Repositorio();

        repositorio.guardar(prueba);
    }
}
