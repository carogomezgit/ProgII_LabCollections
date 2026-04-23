package org.prog.models;

import org.prog.enums.TipoSuscripcion;

public abstract class Suscripcion {
  private int codigoSub;
  private int idUsuario;
  private int diasVigencia;
  private TipoSuscripcion tipo;

  // contador
  private int contador = 0;

  public Suscripcion(int idUsuario, int diasVigencia, TipoSuscripcion tipo) {
    this.codigoSub = contador++;
    this.idUsuario = idUsuario;
    this.diasVigencia = diasVigencia;
    this.tipo = tipo;
  }

  public int getCodigoSub() {
    return codigoSub;
  }

  public int getDiasVigencia() {
    return diasVigencia;
  }

  public void setDiasVigencia(int diasVigencia) {
    this.diasVigencia = diasVigencia;
  }

  public TipoSuscripcion getTipo() {
    return tipo;
  }

  public void setTipo(TipoSuscripcion tipo) {
    this.tipo = tipo;
  }

  public int getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }

  @Override
  public String toString() {
    return "Suscripcion{" +
        "idUsuario=" + idUsuario +
        ", diasVigencia=" + diasVigencia +
        ", tipo=" + tipo +
        '}';
  }
}
