package ejercicioqmp;

import java.util.ArrayList;
import java.util.List;

public class Material {
  private List<Color> colores = new ArrayList<Color>();

  public void agregarColor(Color color) {
    if (color == null) {
      throw new IllegalArgumentException("El color no puede estar vacío");
    }

    colores.add(color);
  }
}
