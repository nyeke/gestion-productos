package com.cice.gestionproductos.web.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/productos")
public class ProductosResource {

    @RequestMapping(method = RequestMethod.GET)
    public String producto(){
        String prod = "No hay productos";
        return prod;
    }
}
