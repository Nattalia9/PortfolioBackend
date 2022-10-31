
package com.portfolio.web.controller;

import com.portfolio.web.model.Habilidad;
import com.portfolio.web.service.IHabilidadService;
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
@RequestMapping("/habilidad")
@RestController
public class HabilidadController {
    
    @Autowired
    private IHabilidadService habServ;
    
     @PostMapping ("/new/habilidad")
    public void crearHabilidad (@RequestBody Habilidad hab) {
        habServ.crearHabilidad(hab);
    }
    
    @GetMapping ("/ver/habilidades")
    @ResponseBody
    public List<Habilidad> verHabilidades () {
        return habServ.verHabilidades();
    }
    
    @GetMapping("lista/{id}")
    public Habilidad buscarHabilidad(@PathVariable Long id) {
        return habServ.buscarHabilidad(id);
    }
    
    @PutMapping("/editar/{id}")
	public void editarHabilidad (@PathVariable Long id, @RequestBody Habilidad editHabilidad) {
        Habilidad hab = habServ.buscarHabilidad(id);
        hab = editHabilidad;
        habServ.crearHabilidad(hab);
    }
        
    @DeleteMapping ("/delete/{id}")
    public void borrarHabilidad (@PathVariable Long id) {
        habServ.borrarHabilidad(id);
    } 
    
}
