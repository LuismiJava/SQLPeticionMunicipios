/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ciudadesprovinciasxml;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 *
 * @author FP Mañana A
 */
public interface ServicioXMLMunicipios {
    
     // @GET("ovcservweb/ovcswlocalizacionrc/ovccallejero.asmx/ConsultaMunicipio?Provincia={id}Municipio=")
  
          
 // Call<ClaseRaizMunicipios> devolverDatosMunicipios(@Path("id") String id);
    
    @GET("ovcservweb/ovcswlocalizacionrc/ovccallejero.asmx/ConsultaMunicipio?Provincia=LLEIDA&Municipio=")
    Call<ClaseRaizMunicipios> devolverDatosMunicipios();
}
