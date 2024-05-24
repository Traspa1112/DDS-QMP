package ejercicioqmp;

import javax.print.DocFlavor;
import java.security.Guard;

public class TuPrendaMePareceHorribleSugerencia implements SugerenciaModa{
  private Prenda prenda;
  private EstadoSugerencia estado = EstadoSugerencia.PENDIENTE_EVALUACION;

  public TuPrendaMePareceHorribleSugerencia(Prenda prenda){
    if(prenda == null){
      throw new IllegalArgumentException("La prenda no puede ser vacia");
    }

    this.prenda = prenda;
  }

  public void aceptarSugerencia(Guardarropas guardarropas){
    if(this.estado != EstadoSugerencia.PENDIENTE_EVALUACION){
      throw new RuntimeException("No se puede modificar el estado de la sugerencia ACEPTADA/RECHAZADA");
    }
    guardarropas.eliminarPrenda(prenda);
    this.estado = EstadoSugerencia.ACEPTADA;
  }
  public void rechazarSugerencia(Guardarropas guardarropas){
    if(this.estado != EstadoSugerencia.PENDIENTE_EVALUACION){
      throw new RuntimeException("No se puede modificar el estado de la sugerencia ACEPTADA/RECHAZADA");
    }

    this.estado = EstadoSugerencia.RECHAZADA;
  }
  public void rollback(Guardarropas guardarropas){
    if(this.estado != EstadoSugerencia.ACEPTADA){
      throw new RuntimeException("Solo se pueden deshacer las sugerencias aceptadas");
    }
    this.estado = EstadoSugerencia.DESHECHA;
    guardarropas.agregarPrenda(prenda);
  }
}
