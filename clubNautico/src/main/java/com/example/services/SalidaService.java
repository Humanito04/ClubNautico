package com.example.services;

import com.example.personas.Salida;
import com.example.repositories.SalidaRepository;
import com.example.dto.SalidaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalidaService {

    @Autowired
   private SalidaRepository salidaRepository;

    private final ModelMapper MODELMAPPER = new ModelMapper();

    public SalidaDTO convertToDto(Salida salida){
        return MODELMAPPER.map(salida,SalidaDTO.class);
    }

    public Salida convertToEntity(SalidaDTO salidaDTO){
        return MODELMAPPER.map(salidaDTO,Salida.class);
    }


   public Salida crearSalida(SalidaDTO salidaDTO){
        Salida salida = convertToEntity(salidaDTO);
        Salida salidaS = this.salidaRepository.save(salida);
       return salidaS;
   }

   public Salida findSalidaById(Integer idSalida){
       return this.salidaRepository.findById(idSalida).orElseThrow(() ->
               new RuntimeException("Salida no encontrada con id  " + idSalida));
   }

   public SalidaDTO actualizarSalida(SalidaDTO salidaDTO, Integer idSalida){
       if (idSalida == null) {
           throw new IllegalArgumentException("IdSalida no puede ser nulo");
       }
       Salida salidaUpdate = this.salidaRepository.findById(idSalida).orElseThrow(()
               ->new RuntimeException("Salida no encontrada con id " + idSalida));

       BeanUtils.copyProperties(salidaDTO, salidaUpdate);
       return convertToDto(salidaUpdate);
   }

   public List<Salida> listarSalida(){
       return this.salidaRepository.findAll();
   }

   public void borrarSalida(Salida salida){
       this.salidaRepository.delete(salida);
   }
}
