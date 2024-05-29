package com.example.services;

import com.example.personas.Barco;
import com.example.repositories.BarcoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarcoService {

    @Autowired
    private BarcoRepository barcoRepo;

    public Barco crearBarco(Barco barco){
        return this.barcoRepo.save(barco);
    }

    public Barco getBarcoById(int id){
        return this.barcoRepo.findById(id).get();
    }
    public List<Barco> listaBarco(){
        return this.barcoRepo.findAll();
    }

    public Barco actualizarBarco(Barco barco){
        return this.barcoRepo.save(barco);
    }

    public void borrarBarco(int id){
         this.barcoRepo.deleteById(id);
    }

}
