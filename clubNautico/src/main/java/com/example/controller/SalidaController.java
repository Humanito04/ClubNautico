package com.example.controller;

import com.example.personas.Salida;
import com.example.services.SalidaService;
import com.example.services.dto.SalidaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/salida")
public class SalidaController {

    @Autowired
    private SalidaService salidaService;

    @PostMapping
    public Salida crearSalida(SalidaDTO salidaDTO){
        return this.salidaService.crearSalida(salidaDTO);
    }

    @GetMapping
    public List<Salida> listarSalida(){
        return this.salidaService.listarSalida();
    }

    @GetMapping("/{id}")
    public Optional<Salida> buscarSalidaById(@PathVariable Integer id){
        return this.salidaService.findSalidaById(id);
    }

    @PutMapping
    public SalidaDTO actualizarSalida(SalidaDTO salidaDTO, Integer idSalida){
        return this.salidaService.actualizarSalida(salidaDTO, idSalida);
    }

    @DeleteMapping
    public void deleteSalida(Salida salida){
        this.salidaService.borrarSalida(salida);
    }

}
