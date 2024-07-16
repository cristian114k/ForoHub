package com.alura.forohub.foro_hub.respuesta;

import com.alura.forohub.foro_hub.topico.TRepository;
import com.alura.forohub.foro_hub.topico.Topico;
import com.alura.forohub.foro_hub.usuario.URepository;
import com.alura.forohub.foro_hub.usuario.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {

    @Autowired
    private RRepository rRepository;

    @Autowired
    private TRepository tRepository;

    @Autowired
    private URepository uRepository;

    @Autowired
    private RespuestaService servicio;

    @GetMapping
        public List<RespuestaDTO> obtenerRespuestas() {
        return servicio.obtenerRespuestas();
    }

    @PostMapping
    public void registrarRespuesta(@RequestBody Respuesta respuesta) {
    	
    	Optional<Topico> topicoOptional = tRepository.findById(respuesta.getTopico_id().getId());
    	Optional<Usuario> usuarioOptional = uRepository.findById(respuesta.getUsuario_respuesta_id().getId_usuario());
    	
    	respuesta.setTopico_id(topicoOptional.get());
    	respuesta.setUsuario_respuesta_id(usuarioOptional.get());
        rRepository.save(respuesta);
    }
    
    @PutMapping
    @Transactional
    public void actualizarRespuesta(@RequestBody DatosActualizarRespuesta datosActualizarRespuesta) {
        Respuesta respuesta = rRepository.getReferenceById(datosActualizarRespuesta.id_respuesta());
        respuesta.actualizarDatos(datosActualizarRespuesta);
        
    }

    @DeleteMapping("/{id}")
    public void eliminarRespuesta(@PathVariable Long id) {
        Respuesta respuesta = rRepository.getReferenceById(id);
        rRepository.delete(respuesta);
  	}
     

}