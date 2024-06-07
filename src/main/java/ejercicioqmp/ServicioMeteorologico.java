package ejercicioqmp;

import java.util.Map;

public class ServicioMeteorologico {

  public int obtenerCondicionesClimaticasBuenosAires(){
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
    condicionesClimaticas.get(0).get("PrecipitationProbability"); //Devuelve un número del 0 al 1
  }
}
