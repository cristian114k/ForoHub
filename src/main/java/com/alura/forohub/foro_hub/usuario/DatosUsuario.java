package com.alura.forohub.foro_hub.usuario;

import jakarta.validation.constraints.NotBlank;

public record DatosUsuario (
        @NotBlank
        String nombre,
        @NotBlank
        String correo_electronico,
        @NotBlank
        String contrasena ) {
}
