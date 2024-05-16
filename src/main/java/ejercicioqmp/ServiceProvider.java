package ejercicioqmp;

public class ServiceProvider {
  private MotorBasico motorDeSugerencias = new MotorBasico();
  private Clima apiClima;
  private String ubicacionClima;

  public MotorBasico obtenerMotorDeSugerencias() {
    return motorDeSugerencias;
  }

  public void setMotorDeSugerencias(MotorBasico motorDeSugerencias) {
    if (motorDeSugerencias == null) {
      throw new IllegalArgumentException("El motor de sugerencia no puede estar vacío");
    }

    this.motorDeSugerencias = motorDeSugerencias;
  }

  public Clima obtenerApiClima() {
    return apiClima;
  }

  public void setApiClima(Clima apiClima) {
    if (apiClima == null) {
      throw new IllegalArgumentException("La api del clima no puede estar vacía");
    }

    this.apiClima = apiClima;
  }

  private static final ServiceProvider INSTANCE = new ServiceProvider();

  public static ServiceProvider instance() {
    return INSTANCE;
  }
}
