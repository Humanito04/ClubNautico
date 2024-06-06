package com.example.dto;

import jakarta.persistence.Column;
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
    private Integer id_socio;
    private Integer id_patron;
}
