package com.example.PokemonAPI.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDTO {
    
    private String mensaje;


    private List<String> detalles;

    private LocalDateTime fecha;
}
