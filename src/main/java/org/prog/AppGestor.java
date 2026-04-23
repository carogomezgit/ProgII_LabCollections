package org.prog;

import org.prog.enums.TipoSuscripcion;
import org.prog.models.Suscripcion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
  public void visualizarSuscripciones() {
    for (Suscripcion sub : listaSuscripciones) {
      System.out.println(sub.toString());
    }
  }

  // busqueda por codigo de suscripcion


  // organizar suscripciones por tipo de plan
  public Map<TipoSuscripcion, List<Suscripcion>> organizarPorTipo() {
    Map<TipoSuscripcion, List<Suscripcion>> mapaSub = new HashMap<>();

    for (Suscripcion sub : listaSuscripciones) {
      TipoSuscripcion tipo = sub.getTipoSuscripcion();
      mapaSub.get(tipo).add(sub);
    }

    return mapaSub;
  }



}
