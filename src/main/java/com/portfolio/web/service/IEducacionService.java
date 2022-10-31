
package com.portfolio.web.service;

import com.portfolio.web.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public void crearEducacion (Educacion edu);
    
    public List<Educacion> verEducaciones ();
    
    public Educacion buscarEducacion (Long id);
    
    public void borrarEducacion (Long id);
    
}
