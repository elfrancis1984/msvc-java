package com.jchalan.springcloud.msvc.cursos.repositories;

import com.jchalan.springcloud.msvc.cursos.models.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
