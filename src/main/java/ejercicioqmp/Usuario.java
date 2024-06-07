package ejercicioqmp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
  private Atuendo sugerenciaDiaria;
  private int edad;
  //TODO: Inicializar guardarropas vacío en vez de lista vacía
  private List<Guardarropas> guardaGuardarropas = Arrays.asList(new Guardarropas());
  private List<Guardarropas> guardarropasAjenos = new ArrayList<Guardarropas>();

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

  public void agregarPrenda(Prenda prenda, Guardarropas guardarropas) {
    if(!this.guardaGuardarropas.contains(guardarropas)){
      throw new IllegalArgumentException("El guardarropas no pertenece al usuario");
    }
    this.validarPrenda(prenda);
    guardarropas.agregarPrenda(prenda);
  }

  public Guardarropas obtenerGuardarropasInicial(){
    return this.guardaGuardarropas.get(0);
  }

  public List<Prenda> obtenerPrendas() {
    return this.guardaGuardarropas.stream()
        .flatMap(guardarropas -> guardarropas.obtenerPrendas().stream())
        .collect(Collectors.toList());
  }

  public int obtenerEdad() {
    return edad;
  }

  public void agregarGuardarropasAjeno(Guardarropas guardarropas){
    if(guardaGuardarropas.contains(guardarropas)){
      throw new IllegalArgumentException("No te podes compartir el guardarropas con vos mismo");
    }
    if(guardarropasAjenos.contains(guardarropas)){
      throw new IllegalArgumentException("Ya agregaste este guardarropas");
    }
    guardarropasAjenos.add(guardarropas);
  }

  public List<SugerenciaModa> obtenerSugerencias(){
    return this.guardaGuardarropas.stream()
        .flatMap(guardarropas -> guardarropas.obtenerSugerencias().stream())
        .collect(Collectors.toList());
  }

  public void calcularSugerenciaDiaria() {
    this.sugerenciaDiaria = this.obtenerMotorDeSugerencias().generarSugerencias(this).get(0);
  }

  public Atuendo obtenerSugerenciaDiaria() {
    return sugerenciaDiaria;
  }
}