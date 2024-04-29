package ejercicioqmp;

import java.util.Collection;
import java.util.Collections;

public class TipoPrenda {
  private CategoriaPrenda categoria;
  private String nombre;
  private Collection<Material> materialesConsistentes = Collections.emptyList();

  public TipoPrenda(String _nombre, CategoriaPrenda _categoria){
    this.nombre = _nombre;
    this.categoria = _categoria;
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
    if(!materialesConsistentes.contains(material)){
      throw new IllegalArgumentException("El material no es consistente con el tipo");
    }
  }
}