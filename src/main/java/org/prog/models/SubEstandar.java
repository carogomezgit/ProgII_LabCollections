package org.prog.models;

import org.prog.enums.TipoSuscripcion;

public class SubEstandar extends Suscripcion {

  public SubEstandar(int idUsuario, int diasVigencia) {
    super(idUsuario, diasVigencia);
  }

  @Override
  public TipoSuscripcion getTipoSuscripcion() {
    return TipoSuscripcion.ESTANDAR;
  }
}
