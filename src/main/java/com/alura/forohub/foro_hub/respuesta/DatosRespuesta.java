package com.alura.forohub.foro_hub.respuesta;

import com.alura.forohub.foro_hub.topico.Topico;
import com.alura.forohub.foro_hub.usuario.Usuario;

import jakarta.validation.constraints.NotBlank;


public record DatosRespuesta (
        @NotBlank
        String mensaje_respuesta,
        @NotBlank
        Topico topico_id,
        @NotBlank
        String fecha_respuesta,
        @NotBlank
        Usuario usuario_respuesta_id,
        @NotBlank
        Boolean solucion ) {
}
