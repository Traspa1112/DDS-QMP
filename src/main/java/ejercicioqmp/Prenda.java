package ejercicioqmp;

public class Prenda {
  private String colorPrimario;
  private String colorSecundario;
  private TipoPrenda tipo;
  private String material;

  public Prenda(TipoPrenda _tipo,String _material, String _colorPrimario){
    this.tipo = _tipo;
    this.material = _material;
    this.colorPrimario = _colorPrimario;
  }

  public Prenda(TipoPrenda _tipo,String _material, String _colorPrimario, String _colorSecundario){
    this(_tipo, _material, _colorPrimario);
    this.colorSecundario = _colorSecundario;
  }
}