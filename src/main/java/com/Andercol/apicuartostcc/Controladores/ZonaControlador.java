package com.Andercol.apicuartostcc.Controladores;


import com.Andercol.apicuartostcc.Entidades.Zona;
import com.Andercol.apicuartostcc.servicios.Implementaciones.ZonaServicioImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/raton/zonas")

public class ZonaControlador {


    @Autowired
    ZonaServicioImp zonaServicio ;
    @PostMapping
    public ResponseEntity <?> registrar(@RequestBody Zona zona){

        try {
            return   ResponseEntity
                    .status(HttpStatus.OK)
                    .body(zonaServicio.registrar(zona));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: Revise su Peticion }");

        }
    }

    @GetMapping
    public ResponseEntity <?> buscartodos(){

        try {
            return   ResponseEntity
                    .status(HttpStatus.OK)
                    .body(zonaServicio.buscartodos());

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: Datos no encontrados }");

        }
    }













}
