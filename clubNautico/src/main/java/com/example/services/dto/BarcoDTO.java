package com.example.services.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BarcoDTO {

    private Integer idBarco;
    private String matricula;
    private String nombre;
}
