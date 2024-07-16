package com.alura.forohub.foro_hub.perfil;

import jakarta.validation.constraints.NotBlank;

public record DatosPerfil (
        @NotBlank
        String nombre_perfil ) {
}
