package com.alura.forohub.foro_hub.topico;

import com.alura.forohub.foro_hub.curso.Curso;
import com.alura.forohub.foro_hub.respuesta.Respuesta;
import com.alura.forohub.foro_hub.usuario.Usuario;

import jakarta.validation.constraints.NotBlank;
import java.util.List;


public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String fecha_creacion,
        @NotBlank
        Boolean status,
        @NotBlank
        Usuario usuario_id,
        @NotBlank
        Curso curso_id,
        @NotBlank
        List<Respuesta> respuestas

        ) {
}
