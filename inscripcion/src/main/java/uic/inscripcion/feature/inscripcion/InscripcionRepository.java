package uic.inscripcion.feature.inscripcion;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface InscripcionRepository extends CrudRepository<Inscripcion, Long> {

    List<Inscripcion> findAll();
}
