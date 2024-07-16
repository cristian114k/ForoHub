package com.alura.forohub.foro_hub.curso;

import jakarta.validation.constraints.NotBlank;

public record DatosCurso (
        @NotBlank
        String nombre_curso,
        @NotBlank
        String categoria ) {
}
