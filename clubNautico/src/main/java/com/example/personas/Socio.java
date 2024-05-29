package com.example.personas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "socio")
@NoArgsConstructor
@AllArgsConstructor
public class Socio {

    @Id
    private int id_socio;

}
