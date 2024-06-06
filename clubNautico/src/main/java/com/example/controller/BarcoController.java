package com.example.controller;

import com.example.personas.Barco;
import com.example.responses.Response;
import com.example.services.BarcoService;
import com.example.dto.BarcoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/barco")
public class BarcoController {

    @Autowired
    private BarcoService barcoService;

    @PostMapping
    public Response<Barco> crearBarco(@RequestBody BarcoDTO barcoDTO){
        Barco barco = this.barcoService.crearBarco(barcoDTO);
        return new Response<>("Barco creado correctamente", barco);
    }

    @GetMapping
    public Response<List<Barco>> listaBarco(){
        List<Barco> barcos = this.barcoService.listaBarco();
        return new Response<>("Listado de barcos", barcos);
    }

    @GetMapping("/{id}")
    public Response<Barco> getBarcoById(@PathVariable Integer id){
        Barco barco = this.barcoService.getBarcoById(id);
        return new Response<>("Barco obtenido", barco);
    }

    @PutMapping("/{id}")
    public Response<BarcoDTO> updateBarco(@RequestBody BarcoDTO barcoDTO, @PathVariable Integer id){
        BarcoDTO barcoActualizado = this.barcoService.actualizarBarco(barcoDTO, id);
        return new Response<>("Barco actualizado correctamente", barcoActualizado);
    }

    @DeleteMapping("/{id}")
    public Response<Void> deleteBarco(@PathVariable int id){
        this.barcoService.borrarBarco(id);
        return new Response<>("Barco eliminado correctamente", null);
    }
}
