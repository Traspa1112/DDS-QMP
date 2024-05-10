package ejercicioqmp;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class TestMotor {
  @Test
  void validarQueEsteEntreLasPeoresConocidas() {
    Usuario usuario = new Usuario(45, ServiceProvider.instance());
    GeneradorPrenda generadorPrenda = new GeneradorPrenda();
    TipoPrenda tipoPrenda = new TipoPrenda("Remera", CategoriaPrenda.PARTE_SUPERIOR);
    Material cuero = new Material();
    cuero.agregarColor(Color.ROJO);
    tipoPrenda.agregarMaterialConsistente(cuero);
    generadorPrenda.elegirTipoPrenda(tipoPrenda);
    generadorPrenda.elegirMaterial(cuero);
    generadorPrenda.elegirTrama(Trama.LISA);
    generadorPrenda.elegirColor(Color.ROJO, null);
    generadorPrenda.elegirFormalidad(NivelFormalidad.INFORMAL);
    Prenda remeraCuero = generadorPrenda.crearPrenda();

    TipoPrenda tipoJean = new TipoPrenda("Jean", CategoriaPrenda.PARTE_INFERIOR);
    Material telaJean = new Material();
    telaJean.agregarColor(Color.AZUL);
    tipoJean.agregarMaterialConsistente(telaJean);
    generadorPrenda.elegirTipoPrenda(tipoJean);
    generadorPrenda.elegirMaterial(telaJean);
    generadorPrenda.elegirTrama(Trama.RAYADA);
    generadorPrenda.elegirColor(Color.AZUL, null);
    generadorPrenda.elegirFormalidad(NivelFormalidad.FORMAL);
    Prenda jean = generadorPrenda.crearPrenda();

    TipoPrenda tipoZapatillas = new TipoPrenda("Zapatillas", CategoriaPrenda.CALZADO);
    tipoZapatillas.agregarMaterialConsistente(cuero);
    generadorPrenda.elegirTipoPrenda(tipoZapatillas);
    generadorPrenda.elegirMaterial(cuero);
    generadorPrenda.elegirTrama(Trama.LISA);
    generadorPrenda.elegirColor(Color.AMARILLO, null);
    generadorPrenda.elegirFormalidad(NivelFormalidad.FORMAL);
    Prenda zapatillasCuero = generadorPrenda.crearPrenda();

    TipoPrenda tipoCamisa = new TipoPrenda("Camisa", CategoriaPrenda.PARTE_SUPERIOR);
    Material lana = new Material();
    lana.agregarColor(Color.ROJO);
    tipoCamisa.agregarMaterialConsistente(lana);
    generadorPrenda.elegirTipoPrenda(tipoCamisa);
    generadorPrenda.elegirMaterial(lana);
    generadorPrenda.elegirTrama(Trama.LISA);
    generadorPrenda.elegirColor(Color.ROJO, Color.AMARILLO);
    generadorPrenda.elegirFormalidad(NivelFormalidad.FORMAL);
    Prenda camisaFormal = generadorPrenda.crearPrenda();

    usuario.agregarPrenda(remeraCuero);
    usuario.agregarPrenda(jean);
    usuario.agregarPrenda(zapatillasCuero);
    usuario.agregarPrenda(camisaFormal);
    MotorBasico motor = usuario.obtenerMotorDeSugerencias();
    List<Atuendo> sugerencias = motor.generarSugerencias(usuario);
    System.out.print(sugerencias);

    // TODO Terminar el test
  }
}