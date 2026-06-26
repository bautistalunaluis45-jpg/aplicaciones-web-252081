package com.example.PokemonAPI.model;

import org.hibernate.validator.constraints.URL;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="El nombre es obligatorio y no puede ser vacio")
    @Size(min=2, max=50, message="El nombre debe tener 2 y 50 Caracteres")
    private String nombre;

    @NotBlank(message="El tipo es obligatorio y no puede ser vacio")
    private String tipo;

    @NotNull(message="El nivel es obligatorio y no puede ser nulo")
    @Min(value=1, message="El nivel debe ser mayor a 0")
    @Max(value=100, message="El nivel debe ser menor o igual a 100")
    private Integer nivel;

    @Min(value=0, message="El ataque debe ser mayor o igual a 0")
    private Integer ataque;

    @Min(value=0, message="La defensa debe ser mayor o igual a 0")
    private Integer defensa;

    @Size(max=500, message="La descripcion debe tener maximo 500 Caracteres")
    private String descripcion;

    @URL(message="La URL de la imagen no es valida")
    private String imagnUrl;

    



}
