
package com.portfolio.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String habilidadTecnica;
    private int nivelTecnico;
    private String habilidadPersonal;
    private int nivelHabPersonal;

    public Habilidad() {
    }

    public Habilidad(String habilidadTecnica, int nivelTecnico, String habilidadPersonal, int nivelHabPersonal) {
        this.habilidadTecnica = habilidadTecnica;
        this.nivelTecnico = nivelTecnico;
        this.habilidadPersonal = habilidadPersonal;
        this.nivelHabPersonal = nivelHabPersonal;
    }
       
}
