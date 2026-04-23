package org.prog.models;

import org.prog.enums.TipoSuscripcion;

public class SubPremium extends Suscripcion {
  public SubPremium(int idUsuario, int diasVigencia) {
    super(idUsuario, diasVigencia);
  }

  @Override
  public TipoSuscripcion getTipoSuscripcion() {
    return TipoSuscripcion.PREMIUM;
  }
}
