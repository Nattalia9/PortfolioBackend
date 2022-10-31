
package com.portfolio.web.service;

import com.portfolio.web.model.Experiencia;
import com.portfolio.web.repository.ExperienciaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public void crearExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public List<Experiencia> verExperiencias() {
        return expRepo.findAll();
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }
    
}
