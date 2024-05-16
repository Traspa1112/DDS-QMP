package ejercicioqmp;

import com.google.common.collect.Lists;
import java.util.List;

public class MotorBasico {
  private ServiceProvider provider;
  protected List<Prenda> obtenerPrendasValidas(Usuario usuario) {
    Clima apiClima = provider.obtenerApiClima();
    return usuario.obtenerPrendas().stream().filter(prenda ->
        prenda.obtenerTemperaturaMaximaAdecuada() <= apiClima.obtenerClima()).toList();
  }

  public List<Atuendo> generarSugerencias(Usuario usuario) {
    List<Prenda> prendas = obtenerPrendasValidas(usuario);
    List<Prenda> prendasSuperiores = prendas.stream().filter(Prenda::esSuperior).toList();
    List<Prenda> prendasInferiores = prendas.stream().filter(Prenda::esInferior).toList();
    List<Prenda> prendasCalzado = prendas.stream().filter(Prenda::esCalzado).toList();
    List<List<Prenda>> sugerencias = Lists.cartesianProduct(prendasSuperiores, prendasInferiores,
        prendasCalzado);
    return sugerencias.stream().map(sugerencia -> new Atuendo(sugerencia.get(0),
        sugerencia.get(1), sugerencia.get(2))).toList();
  }
}
