package com.example.controller;

import com.example.personas.Salida;
import com.example.services.SalidaService;
import com.example.dto.SalidaDTO;
import com.example.responses.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salida")
public class SalidaController {

    @Autowired
    private SalidaService salidaService;

    @PostMapping
    public Response<Salida> crearSalida(@RequestBody SalidaDTO salidaDTO){
        Salida salida = this.salidaService.crearSalida(salidaDTO);
        return new Response<>("Salida creada correctamente", salida);
    }

    @GetMapping
    public Response<List<Salida>> listarSalida(){
        List<Salida> salidas = this.salidaService.listarSalida();
        return new Response<>("Listado de salidas", salidas);
    }

    @GetMapping("/{id}")
    public Response<Salida> buscarSalidaById(@PathVariable Integer id){
        Salida salida = this.salidaService.findSalidaById(id);
        return new Response<>("Salida obtenida", salida);
    }

    @PutMapping("/{id}")
    public Response<SalidaDTO> actualizarSalida(@RequestBody SalidaDTO salidaDTO, @PathVariable Integer id){
        SalidaDTO salidaActualizada = this.salidaService.actualizarSalida(salidaDTO, id);
        return new Response<>("Salida actualizada correctamente", salidaActualizada);
    }

    @DeleteMapping("/{id}")
    public Response<Void> borrarSalida(@PathVariable Integer id){
        Salida salida = this.salidaService.findSalidaById(id);
        if (salida != null) {
            this.salidaService.borrarSalida(salida);
            return new Response<>("Salida eliminada correctamente", null);
        } else {
            return new Response<>("Salida no encontrada", null);
        }
    }
}

