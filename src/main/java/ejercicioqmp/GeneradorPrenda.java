package ejercicioqmp;

public class GeneradorPrenda {
  private Color colorPrimario;
  private Color colorSecundario;
  private TipoPrenda tipo;
  private Material material;
  private Trama trama = Trama.LISA;
  private NivelFormalidad nivelFormalidad;

  public void elegirTipoPrenda(TipoPrenda tipo) {
    if (tipo == null) {
      throw new IllegalArgumentException("El tipo de prenda no puede estar vacío");
    }

    this.tipo = tipo;
  }

  public void elegirMaterial(Material material) {
    if (tipo == null) {
      throw new RuntimeException("Debe elegir un tipo de prenda primero");
    }

    if (material == null) {
      throw new IllegalArgumentException("El material no puede estar vacío");
    }

    this.tipo.validarMaterialConsistente(material);
    this.material = material;
  }

  public void elegirTrama(Trama trama) {
    if (trama == null) {
      throw new IllegalArgumentException("La trama no puede estar vacía");
    }

    if (tipo == null) {
      throw new RuntimeException("Debe elegir un tipo de prenda primero");
    }

    if (material == null) {
      throw new RuntimeException("Debe elegir un material primero");
    }

    this.trama = trama;
  }

  public void elegirColor(Color colorPrimario, Color colorSecundario) {
    if (colorPrimario == null) {
      throw new IllegalArgumentException("El color primario no puede estar vacío");
    }

    if (tipo == null) {
      throw new RuntimeException("Debe elegir un tipo de prenda primero");
    }

    if (material == null) {
      throw new RuntimeException("Debe elegir un material primero");
    }

    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public void elegirFormalidad(NivelFormalidad nivelFormalidad) {
    if (nivelFormalidad == null) {
      throw new IllegalArgumentException("El nivel de formalidad no puede estar vacío");
    }

    if (tipo == null) {
      throw new RuntimeException("Debe elegir un tipo de prenda primero");
    }

    if (material == null) {
      throw new RuntimeException("Debe elegir un material primero");
    }

    this.nivelFormalidad = nivelFormalidad;
  }

  public Prenda crearPrenda() {
    if (this.tipo == null) {
      throw new RuntimeException("Debe elegir un tipo de prenda primero");
    }

    if (this.material == null) {
      throw new RuntimeException("Debe elegir un material primero");
    }

    if (this.colorPrimario == null) {
      throw new RuntimeException("Debe elegir un color primario primero");
    }

    return new Prenda(this.tipo, this.material, this.colorPrimario, this.colorSecundario,
        this.nivelFormalidad);
  }
}
