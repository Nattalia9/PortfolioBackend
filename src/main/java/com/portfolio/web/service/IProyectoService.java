
package com.portfolio.web.service;

import com.portfolio.web.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public void crearProyecto (Proyecto proj);
    
    public List<Proyecto> verProyectos ();
    
    public Proyecto buscarProyecto (Long id);
    
    public void borrarProyecto (Long id);
    
}
