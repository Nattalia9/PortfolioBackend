
package com.portfolio.web.controller;

import com.portfolio.web.model.Proyecto;
import com.portfolio.web.service.IProyectoService;
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
@RequestMapping("/proyecto")
@RestController
public class ProyectoController {
    
    @Autowired
    private IProyectoService projServ;
    
    @PostMapping ("/new/proyecto")
    public void crearProyecto (@RequestBody Proyecto proj) {
        projServ.crearProyecto(proj);
    }
    
    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<Proyecto> verProyectos () {
        return projServ.verProyectos();
    }
    
    @GetMapping("lista/{id}")
    public Proyecto buscarProyecto(@PathVariable Long id) {
        return projServ.buscarProyecto(id);
    }
    
    @PutMapping("/editar/{id}")
	public void editarProyecto (@PathVariable Long id, @RequestBody Proyecto editProyecto) {
        Proyecto proj = projServ.buscarProyecto(id);
        proj = editProyecto;
        projServ.crearProyecto(proj);
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarProyecto (@PathVariable Long id) {
        projServ.borrarProyecto(id);
    }
    
}
