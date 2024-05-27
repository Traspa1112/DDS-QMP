package ejercicioqmp;

import java.util.ArrayList;
import java.util.List;

public class Guardarropas {
  private List<Prenda> prendas = new ArrayList<Prenda>();
  private List<SugerenciaModa> sugerencias;

  public List<SugerenciaModa> obtenerSugerencias(){
    return this.sugerencias;
  }

  public void agregarPrenda(Prenda prenda){
    if(prenda == null){
      throw new IllegalArgumentException("La prenda no puede ser vacia");
    }
    prendas.add(prenda);
  }

  public void eliminarPrenda(Prenda prenda){
    if(prenda == null){
      throw new IllegalArgumentException("La prenda no puede ser vacia");
    }
    prendas.remove(prenda);
  }

  public List<Prenda> obtenerPrendas(){
    return this.prendas;
  }


  public void compartirGuardarropasCon(Usuario usuario){
    usuario.agregarGuardarropasAjeno(this);
  }

  public void adhesionPrendaTentativa(Prenda prenda){
    this.sugerencias.add(new AdhesionPrendaSugerencia(prenda));
  }

  public void sacaEsaPrendaHorrible(Prenda prenda){
    this.sugerencias.add(new TuPrendaMePareceHorribleSugerencia(prenda));
  }

  public void deshacerSugerenciaAceptada(SugerenciaModa sugerencia){
    if(!sugerencias.contains(sugerencia)){
      throw new IllegalArgumentException("La sugerencia indicada no pertenece a este guardarropas");
    }
    sugerencia.deshacer(this);
  }
}
