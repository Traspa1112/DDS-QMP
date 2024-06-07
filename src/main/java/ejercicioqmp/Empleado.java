package ejercicioqmp;

import java.util.List;

public class Empleado {
  private List<Usuario> usuarios;

  public void calcularSugerenciasDiarias() {
    usuarios.forEach(Usuario::calcularSugerenciaDiaria);
  }
}
