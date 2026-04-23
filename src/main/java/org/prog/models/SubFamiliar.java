package org.prog.models;

import org.prog.enums.TipoSuscripcion;
import org.prog.exception.PinInvalidoException;

public class SubFamiliar extends Suscripcion{
  // pin de acceso parental solo para sub familiar
  private String pinAccesoParental;

  public SubFamiliar(int idUsuario, int diasVigencia, String pinAccesoParental) throws PinInvalidoException {
    super(idUsuario, diasVigencia, TipoSuscripcion.FAMILIAR);

    if (pinAccesoParental == null || pinAccesoParental.length() != 4 || !pinAccesoParental.matches("[0-9]+")) {
      throw new PinInvalidoException("El pin de acceso parental debe ser de 4 dígitos");
    }
    this.pinAccesoParental = pinAccesoParental;
  }
}
