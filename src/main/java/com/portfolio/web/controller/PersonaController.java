
package com.portfolio.web.controller;

import com.portfolio.web.model.Persona;
import com.portfolio.web.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("/persona")
@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    
    /*@GetMapping("/{id}")
    public Persona buscarPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }*/
    
    @GetMapping("/ver/perfil")//veeeer
    public Persona buscarPersona() {
        return persoServ.buscarPersona((long)1);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoServ.verPersonas();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
	public void editarPersona (@PathVariable Long id, @RequestBody Persona editPersona) {
        Persona per = persoServ.buscarPersona(id);
        per = editPersona;
        persoServ.crearPersona(per);
    }
    
}
