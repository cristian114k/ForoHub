package com.alura.forohub.foro_hub.respuesta;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RRepository extends JpaRepository<Respuesta, Long> {
    Page<Respuesta> findAll(Pageable paginacion);
}
