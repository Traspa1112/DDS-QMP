package ejercicioqmp;

import java.util.List;

public class ServicioMeteorologicoAccuWeather implements Clima {

  public float obtenerClima() {
//    AccuWeatherAPI apiClima = new AccuWeatherAPI();
//    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
//    return condicionesClimaticas.get(0).get("PrecipitationProbability"); //Devuelve un número del 0
    // al 1
    return 0.0f;
  }

  public List<AlertaMeteorologica> alertasStringAEnum(List<String> alertas) {
    return alertas.stream().map(AlertaMeteorologica::valueOf).toList();
  }

  public List<AlertaMeteorologica> obtenerAlertasMeteorologicas() {
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    Map<String, Object> alertas = apiClima.getAlertas("Buenos Aires");
    return adaptarListaDeAlertas(alertas.get("CurrentAlerts"));
  }
}
