package ejercicioqmp;

public class ServiceProvider {
  private MotorBasico motorDeSugerencias = new MotorBasico();

  public MotorBasico obtenerMotorDeSugerencias() {
    return motorDeSugerencias;
  }

  public void setMotorDeSugerencias(MotorBasico motorDeSugerencias) {
    if (motorDeSugerencias == null) {
      throw new IllegalArgumentException("El motor de sugerencia no puede estar vacío");
    }

    this.motorDeSugerencias = motorDeSugerencias;
  }

  private static final ServiceProvider INSTANCE = new ServiceProvider();

  public static ServiceProvider instance() {
    return INSTANCE;
  }
}
