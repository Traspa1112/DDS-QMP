package ejercicioqmp;

public class Atuendo {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;

  public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
  }

  public String toString() {
    return this.prendaInferior.toString() + prendaSuperior.toString() + calzado.toString();
  }
}
