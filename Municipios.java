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
 */
@Root(name="consulta_municipiero", strict=false)

public class Municipios {
  @Element
  private String nm;
  @Element
  private Locat locat;

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public Locat getLocat() {
        return locat;
    }

    public void setLocat(Locat locat) {
        this.locat = locat;
    }

    @Override
    public String toString() {
        return "\n"+"Municipios{" + "Nombre del Municipio=" + nm + ", Código=" + locat + '}';
    }
  
  
            
}
