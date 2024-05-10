package ejercicioqmp;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private int edad;
  private List<Prenda> guardarropas = new ArrayList<Prenda>();
  private ServiceProvider provider;

  public Usuario(int edad, ServiceProvider provider) {
    if (provider == null) {
      throw new IllegalArgumentException("El provider no puede estar vacío");
    }

    this.edad = edad;
    this.provider = provider;
  }

  private void validarPrenda(Prenda prenda) {
    //TODO: Relevar cuáles son los criterios para que una prenda sea considerada como válida
  }

  public MotorBasico obtenerMotorDeSugerencias() {
    return provider.obtenerMotorDeSugerencias();
  }

  public void agregarPrenda(Prenda prenda) {
    this.validarPrenda(prenda);
    guardarropas.add(prenda);
  }

  public List<Prenda> obtenerPrendas() {
    return guardarropas;
  }

  public int obtenerEdad() {
    return edad;
  }
}