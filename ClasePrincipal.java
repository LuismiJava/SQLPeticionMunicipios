/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ciudadesprovinciasxml;


import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 *
 * @author FP Mañana A
 */
public class ClasePrincipal extends Application implements ChangeListener{
       VBox v; 
       ChoiceBox cb;
       ChoiceBox cb2;
       Label lb_texto;
     public static void main(String[] args) {
         
        launch(args);
         
        String base="http://ovc.catastro.meh.es/";
    
        
        Retrofit retrofit=new Retrofit.Builder()
        .baseUrl(base).addConverterFactory(SimpleXmlConverterFactory.create())
        .build();
        
        ServicioXMLProvincias servicio_provincias=retrofit.create(ServicioXMLProvincias.class);
        ServicioXMLMunicipios servicio_municipios=retrofit.create(ServicioXMLMunicipios.class);
        
        Call<ClaseRaizProvincias>objeto_raiz_provincias=servicio_provincias.devolverDatosProvincias();
        
        Call<ClaseRaizMunicipios>objeto_raiz_municipios=servicio_municipios.devolverDatosMunicipios();
        
        objeto_raiz_provincias.enqueue(new Callback<ClaseRaizProvincias>() {
            @Override
            public void onResponse(Call<ClaseRaizProvincias> call, Response<ClaseRaizProvincias> rspns) {
                
                System.out.println(rspns.body());
            }

            @Override
            public void onFailure(Call<ClaseRaizProvincias> call, Throwable thrwbl) {
                System.out.println(thrwbl.toString());
            }
        });
        
        objeto_raiz_municipios.enqueue(new Callback<ClaseRaizMunicipios>() {
            @Override
            public void onResponse(Call<ClaseRaizMunicipios> call, Response<ClaseRaizMunicipios> rspns) {
                   System.out.println(rspns.body());
            }

            @Override
            public void onFailure(Call<ClaseRaizMunicipios> call, Throwable thrwbl) {
               System.out.println(thrwbl.toString());
            }
        });
        
      
     }

  @Override
	public void start(Stage window) throws Exception {
            String idiomas[]={};
            v=new VBox(10);
            cb=new ChoiceBox();
            cb.setItems(FXCollections.observableArrayList(idiomas));
            lb_texto=new Label();
            cb.valueProperty().addListener(this);
            v.getChildren().addAll(cb,lb_texto);
            Scene escena=new Scene(v,300,300);
            window.setScene(escena);
            window.show();
	}
        AccesoDatos.conectar();
        AccesoDatos.grabarProvincias(p)

    @Override

    public void changed(ObservableValue ov, Object t, Object t1) {
        if(cb.getSelectionModel().getSelectedItem()=="Spanish"){
            lb_texto.setText("Seleccionaste el idioma español");
        }
        else if(cb.getSelectionModel().getSelectedItem()=="English"){
            lb_texto.setText("You selected the english language");
        }
        else if(cb.getSelectionModel().getSelectedItem()=="German"){
            lb_texto.setText("Sie haben die deutsche Sprache ausgewählt");
        }
    }
    }