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
@Root(name="consulta_municipiero", strict=false)
public class ClaseRaizMunicipios {
     @ElementList
  private List<Municipios> municipiero;

    public List<Municipios> getMunicipiero() {
        return municipiero;
    }

    public void setMunicipiero(List<Municipios> municipiero) {
        this.municipiero = municipiero;
    }

    @Override
    public String toString() {
        return "ClaseRaizMunicipios{" + "municipiero=" + municipiero + '}';
    }

   
}
