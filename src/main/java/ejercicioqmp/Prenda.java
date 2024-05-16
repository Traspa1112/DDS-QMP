package ejercicioqmp;

public class Prenda {
  private Color colorPrimario;
  private Color colorSecundario;
  private TipoPrenda tipo;
  private Material material;
  private NivelFormalidad formalidad;

  public Prenda(TipoPrenda tipo, Material material, Color colorPrimario, Color colorSecundario,
                NivelFormalidad formalidad) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.formalidad = formalidad;
  }

  public boolean esSuperior() {
    return this.tipo.getCategoria().equals(CategoriaPrenda.PARTE_SUPERIOR);
  }

  public boolean esInferior() {
    return this.tipo.getCategoria().equals(CategoriaPrenda.PARTE_INFERIOR);
  }

  public boolean esCalzado() {
    return this.tipo.getCategoria().equals(CategoriaPrenda.CALZADO);
  }

  public String toString() {
    return formalidad.toString();
  }

  public boolean esInformal() {
    return formalidad == NivelFormalidad.INFORMAL;
  }

  public float obtenerTemperaturaMaximaAdecuada(){
    return this.tipo.getTemperaturaMaximaAdecuada();
  }
}