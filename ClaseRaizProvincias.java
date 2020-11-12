/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ciudadesprovinciasxml;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author FP Mañana A
 */
@Root(name="consulta_provinciero", strict=false)
public class ClaseRaizProvincias {
    
     @ElementList
    private List<Provincias> provinciero;

    public List<Provincias> getProvinciero() {
        return provinciero;
    }

    public void setProvinciero(List<Provincias> provinciero) {
        this.provinciero = provinciero;
    }

    @Override
    public String toString() {
        return "Provincia{" + "provinciero=" + provinciero + '}';
    }
    
}
