package com.example.personas;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "patron")
@AllArgsConstructor
@NoArgsConstructor
public class Patron {

    @Id
    private int id_patron;
}
