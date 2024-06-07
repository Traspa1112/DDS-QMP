package ejercicioqmp;

import java.util.ArrayList;
import java.util.List;

public class RegistroAlertas {
  private List<AlertaMeteorologica> alertasRecientes = new ArrayList<>();

  public void actualizarAlertas() {
    this.alertasRecientes = new ServicioMeteorologicoAccuWeather().obtenerAlertasMeteorologicas();
  }
}
