package ejercicioqmp;

import java.util.ArrayList;
import java.util.List;

public class TipoPrenda {
  private CategoriaPrenda categoria;
  private String nombre;
  private List<Material> materialesConsistentes = new ArrayList<Material>();

  public TipoPrenda(String nombre, CategoriaPrenda categoria) {
    this.nombre = nombre;
    this.categoria = categoria;
  }

  public void agregarMaterialConsistente(Material material) {
    if (materialesConsistentes.contains(material)) {
      throw new IllegalArgumentException("El material elegido ya existe en la lista");
    }

    materialesConsistentes.add(material);
  }

  public void sacarMaterialConsistente(Material material) {
    if (!materialesConsistentes.contains(material)) {
      throw new IllegalArgumentException("El material elegido no existe en la lista");
    }

    materialesConsistentes.remove(material);
  }

  public void validarMaterialConsistente(Material material) {
    if (!materialesConsistentes.contains(material)) {
      throw new IllegalArgumentException("El material no es consistente con el tipo");
    }
  }

  public CategoriaPrenda getCategoria() {
    return categoria;
  }
}