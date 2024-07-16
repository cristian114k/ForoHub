package com.alura.forohub.foro_hub.respuesta;

import com.alura.forohub.foro_hub.topico.Topico;
import com.alura.forohub.foro_hub.usuario.Usuario;

public record DatosListadoRespuesta(Long id_respuesta, String mensaje_respuesta, Topico topico_id, String fecha_respuesta, Usuario usuario_respuesta_id, Boolean solucion) {

    public DatosListadoRespuesta(Respuesta respuesta) {
        this(respuesta.getId_respuesta(), respuesta.getMensaje_respuesta(), respuesta.getTopico_id(), respuesta.getFecha_respuesta(), respuesta.getUsuario_respuesta_id(), respuesta.getSolucion());
    }
}
