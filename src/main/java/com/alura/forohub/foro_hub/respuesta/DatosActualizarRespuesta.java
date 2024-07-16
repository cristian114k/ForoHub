package com.alura.forohub.foro_hub.respuesta;

import com.alura.forohub.foro_hub.topico.Topico;
import com.alura.forohub.foro_hub.usuario.Usuario;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarRespuesta(@NotNull Long id_respuesta, String mensaje_respuesta, Topico topico, String fecha_respuesta,Usuario usuario_respuesta_id, Boolean solucion) {
}
