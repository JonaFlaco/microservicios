package uic.inscripcion.feature.inscripcion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class InscripcionService {
    @Autowired
    InscripcionRepository inscripcionRepository;

    @Transactional
    public Inscripcion save(Inscripcion entity) {
        return inscripcionRepository.save(entity);
    }

    public Inscripcion findById(Long id) {
        return inscripcionRepository.findById(id).orElse(new Inscripcion());
    }

    public void deleteById(Long id) {
        inscripcionRepository.deleteById(id);
    }

    public List<Inscripcion> findAll() {
        return inscripcionRepository.findAll();
    }
}