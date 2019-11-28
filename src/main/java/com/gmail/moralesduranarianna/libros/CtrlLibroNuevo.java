package com.gmail.moralesduranarianna.libros;

import javax.inject.Named;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import com.gmail.moralesduranarianna.web.Mensajes;


@Named
@ViewScoped
public class CtrlLibroNuevo implements Serializable {
  private static final long serialVersionUID = 1L;
  @Inject
  private Mensajes mensajes;
  @Inject
  private DaoLibro dao;
  private Libro modelo;
  @PostConstruct
  void init() {
    modelo = new Libro();
  }
  public Libro getModelo() {
    return modelo;
  }
  
  public String guarda() {
    try {
      dao.agrega(modelo);
      return "index?faces-redirect=true";
    } catch (Exception ex) {
      mensajes.procesa(ex);
      return null;
    }
  }
}
