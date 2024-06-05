package com.example.services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalidaDTO {

    private Integer idSalida;
    private LocalDateTime fechaHoraSalida;
    private String destino;
    private Integer idPatron;

}
