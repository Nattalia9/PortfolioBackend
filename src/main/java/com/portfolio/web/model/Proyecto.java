
package com.portfolio.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;
    private String urlImagen;
    private String urlRepositorio;
    private String tecnologias;

    public Proyecto() {
    }

    public Proyecto(String titulo, String descripcion, String urlImagen, String urlRepositorio, String tecnologias) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.urlRepositorio = urlRepositorio;
        this.tecnologias = tecnologias;
    }
     
}
