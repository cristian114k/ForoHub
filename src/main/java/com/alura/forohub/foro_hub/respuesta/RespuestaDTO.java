package com.alura.forohub.foro_hub.respuesta;

import com.alura.forohub.foro_hub.topico.Topico;
import com.alura.forohub.foro_hub.usuario.Usuario;

public record RespuestaDTO(Long id_respuesta,
                           String mensaje_respuesta,
                           Topico topico_id,
                           String fecha_respuesta,
                           Usuario usuario_respuesta_id,
                           Boolean solucion

    ){
}
