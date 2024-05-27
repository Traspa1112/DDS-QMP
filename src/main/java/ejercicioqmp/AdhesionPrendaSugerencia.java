package ejercicioqmp;

public class AdhesionPrendaSugerencia implements SugerenciaModa{
  private Prenda prenda;
  private EstadoSugerencia estado = EstadoSugerencia.PENDIENTE_EVALUACION;


  public AdhesionPrendaSugerencia(Prenda prenda){
    if(prenda == null){
      throw new IllegalArgumentException("La prenda no puede ser vacia");
    }
    this.prenda = prenda;
  }

  public void aceptar(Guardarropas guardarropas){
    if(this.estado != EstadoSugerencia.PENDIENTE_EVALUACION){
      throw new RuntimeException("No se puede modificar el estado de la sugerencia ACEPTADA/RECHAZADA");
    }
    guardarropas.agregarPrenda(prenda);
    this.estado = EstadoSugerencia.ACEPTADA;
  }
  
  public void rechazar(Guardarropas guardarropas){
    if(this.estado != EstadoSugerencia.PENDIENTE_EVALUACION){
      throw new RuntimeException("No se puede modificar el estado de la sugerencia ACEPTADA/RECHAZADA");
    }

    this.estado = EstadoSugerencia.RECHAZADA;
  }

  public void deshacer(Guardarropas guardarropas){
    if(this.estado != EstadoSugerencia.ACEPTADA){
      throw new RuntimeException("Solo se pueden deshacer las sugerencias aceptadas");
    }
    this.estado = EstadoSugerencia.DESHECHA;
    guardarropas.eliminarPrenda(prenda);
  }
}
