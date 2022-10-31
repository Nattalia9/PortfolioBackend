
package com.portfolio.web.service;

import com.portfolio.web.model.Habilidad;
import java.util.List;


public interface IHabilidadService {
    
    public void crearHabilidad (Habilidad hab);
    
    public List<Habilidad> verHabilidades ();
    
    public Habilidad buscarHabilidad (Long id);
    
    public void borrarHabilidad (Long id);
    
}
