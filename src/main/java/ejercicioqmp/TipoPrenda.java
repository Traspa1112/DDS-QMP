package ejercicioqmp;

public class TipoPrenda {
  private CategoriaPrenda categoria;
  private String nombre;

  public TipoPrenda(String _nombre, CategoriaPrenda _categoria){
    this.nombre = _nombre;
    this.categoria = _categoria;
  }
}