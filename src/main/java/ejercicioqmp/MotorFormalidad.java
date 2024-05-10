package ejercicioqmp;

import com.google.common.collect.Lists;
import java.util.List;

public class MotorFormalidad extends MotorBasico {
  public List<Prenda> obtenerPrendasValidas(Usuario usuario) {
    List<Prenda> prendas = super.obtenerPrendasValidas(usuario);
    return usuario.obtenerEdad() > 55
        ? prendas.stream().filter(prenda -> !prenda.esInformal()).toList() : prendas;
  }
}
