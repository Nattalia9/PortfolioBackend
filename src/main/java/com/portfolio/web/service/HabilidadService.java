
package com.portfolio.web.service;

import com.portfolio.web.model.Habilidad;
import com.portfolio.web.repository.HabilidadRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadService implements IHabilidadService {

    @Autowired
    public HabilidadRepository habRepo;
    
    @Override
    public void crearHabilidad(Habilidad hab) {
        habRepo.save(hab);
    }

    @Override
    public List<Habilidad> verHabilidades() {
        return habRepo.findAll();
    }

    @Override
    public Habilidad buscarHabilidad(Long id) {
        return habRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habRepo.deleteById(id);
    }
    
}
