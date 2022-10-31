
package com.portfolio.web.controller;

import com.portfolio.web.model.Experiencia;
import com.portfolio.web.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://portfolio-front-d8137.web.app")
@RequestMapping("/experiencia")
@RestController
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping ("/new/experiencia")
    public void crearExperiencia (@RequestBody Experiencia exp) {
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping ("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias () {
        return expServ.verExperiencias();
    }
    
    @GetMapping("/lista/{id}")
    public Experiencia buscarExperiencia(@PathVariable Long id) {
        return expServ.buscarExperiencia(id);
    }
    
   @PutMapping("/editar/{id}")
	public void editarExperiencia (@PathVariable Long id, @RequestBody Experiencia editExperiencia) {
        Experiencia exp = expServ.buscarExperiencia(id);
        exp = editExperiencia;
        expServ.crearExperiencia(exp);
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarExperiencia (@PathVariable Long id) {
        expServ.borrarExperiencia(id);
    }
    
}
