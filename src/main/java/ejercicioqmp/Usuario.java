package ejercicioqmp;

import java.util.Collection;

public class Usuario {
  private Collection<Prenda> guardarropas;

  public Usuario(){}

  private void ValidarPrenda(Prenda _prenda){
    //TODO: Relevar cuáles son los criterios para que una prenda sea considerada como válida
  }

  public void AgregarPrenda(Prenda _prenda){
    this.ValidarPrenda(_prenda);
    guardarropas.add(_prenda);
  }
}