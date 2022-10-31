
package com.portfolio.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String profesion;
    private String email;
    private String provincia;
    private String descripcion;
    private String urlFotoPerfil;
    private String urlBanner;
    private String urlPortfolioPdf;
    

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String profesion, String email, String provincia, String descripcion, String urlFotoPerfil, String urlBanner, String urlPortfolioPdf) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.email = email;
        this.provincia = provincia;
        this.descripcion = descripcion;
        this.urlFotoPerfil = urlFotoPerfil;
        this.urlBanner = urlBanner;
        this.urlPortfolioPdf = urlPortfolioPdf;
    }
      
}
