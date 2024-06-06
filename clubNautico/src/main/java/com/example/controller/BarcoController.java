package com.example.controller;

import com.example.personas.Barco;
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
    public Barco crearBarco(BarcoDTO barcoDTO){
        return this.barcoService.crearBarco(barcoDTO);
    }

    @GetMapping
    public List<Barco> listaBarco(){
        return this.barcoService.listaBarco();
    }

    @GetMapping("/getBarcoById/{id}")
    public Barco getBarcoById(@PathVariable Integer id){
        return this.barcoService.getBarcoById(id);
    }

    @PutMapping("/updateBarco/{id}")
    public BarcoDTO updateBarco (BarcoDTO barcoDTO, Integer idBarco){
        return this.barcoService.actualizarBarco(barcoDTO,idBarco);
    }

    @DeleteMapping
    public void deleteBarco(int id){
        this.barcoService.borrarBarco(id);
    }


}
