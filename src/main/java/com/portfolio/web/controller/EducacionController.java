
package com.portfolio.web.controller;

import com.portfolio.web.model.Educacion;
import com.portfolio.web.service.IEducacionService;
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
@RequestMapping("/educacion")
@RestController
public class EducacionController {
    
    @Autowired
    private IEducacionService eduServ;
    
     @PostMapping ("/new/educacion")
    public void crearEducacion (@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping ("/ver/educaciones")
    @ResponseBody
    public List<Educacion> verEducaciones () {
        return eduServ.verEducaciones();
    }
    
    @GetMapping("lista/{id}")
    public Educacion buscarEducacion(@PathVariable Long id) {
        return eduServ.buscarEducacion(id);
    }
    
    @PutMapping("/editar/{id}")
	public void editarEducacion (@PathVariable Long id, @RequestBody Educacion editEducacion) {
        Educacion edu = eduServ.buscarEducacion(id);
        edu = editEducacion;
        eduServ.crearEducacion(edu);
    }
        
    @DeleteMapping ("/delete/{id}")
    public void borrarEducacion (@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }    
    
}
