
package com.portfolio.web.service;

import com.portfolio.web.model.Proyecto;
import com.portfolio.web.repository.ProyectoRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService implements IProyectoService {

    @Autowired
    public ProyectoRepository projRepo;
    
    @Override
    public void crearProyecto(Proyecto proj) {
        projRepo.save(proj);
    }

    @Override
    public List<Proyecto> verProyectos() {
        return projRepo.findAll();
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return projRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarProyecto(Long id) {
        projRepo.deleteById(id);
    }
    
}
