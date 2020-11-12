/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ciudadesprovinciasxml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author FP Mañana A
 * 
 * 
 */

@Root(name="consulta_provinciero", strict=false)
public class Provincias {
    @Element
    private String cpine;
     @Element
    private String np;

    public String getCpine() {
        return cpine;
    }

    public void setCpine(String cpine) {
        this.cpine = cpine;
    }

    public String getNp() {
        return np;
    }

    public void setNp(String np) {
        this.np = np;
    }

    @Override
    public String toString() {
        return "\n"+"Provincias{" + "Nombre del Municipio=" + np + ", Código=" + cpine + '}';
    }
        
        
    
    
}
