package com.example.controller;

import com.example.personas.Barco;
import com.example.services.BarcoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/barco")
public class BarcoController {

    @Autowired
    private BarcoService barcoService;

    @PostMapping
    public Barco crearBarco(Barco barco){
        return this.barcoService.crearBarco(barco);
    }

    @GetMapping
    public List<Barco> listaBarco(){
        return this.barcoService.listaBarco();
    }

    @GetMapping("/{id}")
    public Barco getBarcoById(int id){
        return this.barcoService.getBarcoById(id);
    }

    @PutMapping
    public Barco actualizarBarco (Barco barco){
        return this.barcoService.actualizarBarco(barco);
    }

    @DeleteMapping
    public void deleteBarco(int id){
        this.barcoService.borrarBarco(id);
    }


}
