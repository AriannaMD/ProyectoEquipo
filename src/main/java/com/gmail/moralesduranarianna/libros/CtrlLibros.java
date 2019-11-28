package com.gmail.moralesduranarianna.libros;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.gmail.moralesduranarianna.web.Mensajes;

@Named
@RequestScoped
public class CtrlLibros {
  @Inject
  private Mensajes mensajes;
  @Inject
  private DaoLibro dao;
  private List<Libro> instancias;
  
  @PostConstruct
  void init() {
    try {
      instancias = dao.consulta();
    } catch (Exception ex) {
      mensajes.procesa(ex);
    }
  }
  public List<Libro> getInstancias() {
    return instancias;
  }
}
