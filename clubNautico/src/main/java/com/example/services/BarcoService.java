package com.example.services;

import com.example.personas.Barco;
import com.example.repositories.BarcoRepository;
import com.example.services.dto.BarcoDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarcoService {

    @Autowired
    private BarcoRepository barcoRepo;

    private final ModelMapper MODELMAPPER = new ModelMapper();

    public BarcoDTO convertToDto(Barco barco){
        return MODELMAPPER.map(barco,BarcoDTO.class);
    }

    public Barco convertToEntity(BarcoDTO barcoDTO){
        return MODELMAPPER.map(barcoDTO,Barco.class);
    }

    public Barco crearBarco(BarcoDTO barcoDTO){
        Barco barco = convertToEntity(barcoDTO);
        Barco barcoC = this.barcoRepo.save(barco);
        return barcoC;
    }

    public Barco getBarcoById(int idBarco){
        return this.barcoRepo.findById(idBarco).get();
    }
    public List<Barco> listaBarco(){
        return this.barcoRepo.findAll();
    }

    public BarcoDTO actualizarBarco(BarcoDTO barcoDTO, Integer idBarco){
        Barco barcoUpdate = this.barcoRepo.findById(idBarco).orElseThrow(() ->new RuntimeException(("Barco not found with id "+ idBarco)));

        BeanUtils.copyProperties(barcoDTO, barcoUpdate);
        Barco actualizaBarco = this.barcoRepo.save(barcoUpdate);

        return convertToDto(barcoUpdate);
    }

    public void borrarBarco(Integer idBarco){
         this.barcoRepo.deleteById(idBarco);
    }



}
