package ejercicioqmp;

import java.security.Guard;

public interface SugerenciaModa {
  void aceptarSugerencia(Guardarropas guardarropa);
  void rechazarSugerencia(Guardarropas guardarropas);
  void rollback(Guardarropas guardarropas);
}
