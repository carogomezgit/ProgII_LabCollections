package org.prog;

import org.prog.models.Suscripcion;

import java.util.ArrayList;
import java.util.List;

public class AppGestor {
  private List<Suscripcion> listaSuscripciones;

  public AppGestor() {
    this.listaSuscripciones = new ArrayList<>();
  }


  // registrar suscripcion
  public void registrarSuscripcion(Suscripcion sub) {
    listaSuscripciones.add(sub);
  }

  // visualizar suscripciones


  // busqueda por codigo de suscripcion



}
