package org.prog.models;

import org.prog.enums.TipoSuscripcion;

public class SubEstandar extends Suscripcion {

  public SubEstandar(int idUsuario, int diasVigencia) {
    super(idUsuario, diasVigencia, TipoSuscripcion.ESTANDAR);
  }
}
