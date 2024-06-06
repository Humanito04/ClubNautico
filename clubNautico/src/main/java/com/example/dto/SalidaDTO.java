package com.example.dto;

import com.example.personas.Salida;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalidaDTO {

    private Integer idSalida;
    private LocalDateTime fechaHoraSalida;
    private String destino;
    private Integer idPatron;
    private List<Salida> salida;

}
