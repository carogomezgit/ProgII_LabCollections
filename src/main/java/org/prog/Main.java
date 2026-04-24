package org.prog;

import org.prog.exception.PinInvalidoException;
import org.prog.models.SubEstandar;
import org.prog.models.SubFamiliar;
import org.prog.models.SubPremium;
import org.prog.models.Suscripcion;

public class Main {
  public static void main(String[] args) {
    AppGestor gestor = new AppGestor();

    // crear suscripciones
    Suscripcion sub1 = new SubEstandar(384, 30);
    Suscripcion sub2 = new SubEstandar(298, 60);
    Suscripcion sub3 = new SubPremium(119, 30);
    Suscripcion sub4 = new SubPremium(372, 60);
    Suscripcion sub5 = new SubFamiliar(1044, 30, "1234");

    // sub con pin inválido
    try {
      Suscripcion sub6 = new SubFamiliar(483, 60, "123");
    } catch (PinInvalidoException e) {
      System.out.println(e);
    }

    // registrar suscripciones
    gestor.registrarSuscripcion(sub1);
    gestor.registrarSuscripcion(sub2);
    gestor.registrarSuscripcion(sub3);
    gestor.registrarSuscripcion(sub4);
    gestor.registrarSuscripcion(sub5);
    // gestor.registrarSuscripcion(sub6); <- tiene pin invalido

    // visualizar suscripciones
    gestor.visualizarSuscripciones();

    // buscar sub por codigo
      Suscripcion subEncontrada = gestor.buscarPorCodigo(4);
      if (subEncontrada != null) {
        System.out.println("Suscripción encontrada: " + subEncontrada);
      } else {
        System.out.println("No se encontró una suscripción con este código");
      }


    // organizar suscripciones existentes por tipo de plan



  }
}