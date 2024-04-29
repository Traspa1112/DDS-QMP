package ejercicioqmp;

public class Prenda {
  private Color colorPrimario;
  private Color colorSecundario;
  private TipoPrenda tipo;
  private Material material;

  public Prenda(TipoPrenda tipo, Material material, Color colorPrimario, Color colorSecundario){
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }
}