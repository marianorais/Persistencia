package domain.entities.ejercicio_03;

import domain.entities.Repositorio;

public class AMainEjercicio3 {
  // corre el metodo main para persistir y ver como queda en tu DB!

  public static void main(String[] args) {

    Repositorio repositorio = new Repositorio();

    //* -------------- Marcas --------------
    Marca lays = new Marca();
    lays.setNombre("Lays");

    Marca cocaCola = new Marca();
    cocaCola.setNombre("Coca Cola");

    Marca paty = new Marca();
    paty.setNombre("Paty");

    Marca marcaNachos = new Marca();
    marcaNachos.setNombre("Combo Nachos!");
    repositorio.guardar(marcaNachos);
    repositorio.guardar(paty);
    repositorio.guardar(cocaCola);
    repositorio.guardar(lays);

    //* -------------- Producto Simple --------------
    ProductoSimple papas = new ProductoSimple();
    papas.setNombre("Papas");
    papas.setMarca(lays);
    papas.setPrecio(100.0);
    papas.setStock(10);
    repositorio.guardar(papas);


    ProductoSimple coca = new ProductoSimple();
    coca.setNombre("Coca");
    coca.setMarca(cocaCola);
    coca.setStock(20);
    coca.setPrecio(150.0);
    repositorio.guardar(coca);


    ProductoSimple hamburguesa = new ProductoSimple();
    hamburguesa.setNombre("Hamburguesa");
    hamburguesa.setMarca(paty);
    hamburguesa.setStock(30);
    hamburguesa.setPrecio(200.0);
    repositorio.guardar(hamburguesa);

    Combo ComboHamburguesaConPapasYBebida = new Combo();
    ComboHamburguesaConPapasYBebida.setNombre("Combo Hamburguesa con Papas y Bebida");
    ComboHamburguesaConPapasYBebida.setMarca(marcaNachos);
    ComboHamburguesaConPapasYBebida.agregarProducto(hamburguesa);
    ComboHamburguesaConPapasYBebida.agregarProducto(papas);
    ComboHamburguesaConPapasYBebida.agregarProducto(coca);

    repositorio.guardar(ComboHamburguesaConPapasYBebida);

    DescuentoFijo descuentoFijo = new DescuentoFijo();
    descuentoFijo.setNombre("DescuentoFijo");
    descuentoFijo.setValor(100.0);

    repositorio.guardar(descuentoFijo);

    Packaging packagingDeHamburguesa = new Packaging();

    packagingDeHamburguesa.setPrecio(50.0);
    packagingDeHamburguesa.setProducto(hamburguesa);
    repositorio.guardar(packagingDeHamburguesa);
  }
}
