
package com.portfolio.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String puesto;
    private String empresa;
    private String fecha;
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(String puesto, String empresa, String fecha, String descripcion) {
        this.puesto = puesto;
        this.empresa = empresa;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }    
}
