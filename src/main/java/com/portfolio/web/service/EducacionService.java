
package com.portfolio.web.service;

import com.portfolio.web.model.Educacion;
import com.portfolio.web.repository.EducacionRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository eduRepo;

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public List<Educacion> verEducaciones() {
        return eduRepo.findAll();
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }
    
}
