package com.alura.forohub.foro_hub.topico;


import com.alura.forohub.foro_hub.curso.Curso;
import com.alura.forohub.foro_hub.respuesta.Respuesta;
import com.alura.forohub.foro_hub.usuario.Usuario;

import java.util.List;

public record TopicoDTO(Long id,
                        String titulo,
                        String mensaje,
                        String fecha_creacion,
                        Boolean status,
                        Usuario usuario_id,
                        Curso curso_id,
                        List<Respuesta> respuestas

){
}
