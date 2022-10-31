
package com.portfolio.web.service;

import com.portfolio.web.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public void crearExperiencia (Experiencia exp);
    
    public List<Experiencia> verExperiencias ();
    
    public Experiencia buscarExperiencia (Long id);
    
    public void borrarExperiencia (Long id);
    
}
