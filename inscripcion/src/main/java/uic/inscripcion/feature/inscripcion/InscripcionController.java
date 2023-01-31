package uic.inscripcion.feature.inscripcion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/inscripcion")
@CrossOrigin({ "*" }) 

public class InscripcionController {


    @Autowired
    InscripcionService inscripcionService;

    @GetMapping("/{id}/")
    public Inscripcion findById(@PathVariable Long id) {
        return inscripcionService.findById(id);
    }


    @GetMapping("/")
    public List<Inscripcion> findAll() {
        return inscripcionService.findAll();
    }

    @PostMapping("/")
    public Inscripcion save(@RequestBody Inscripcion entity) {
        return inscripcionService.save(entity);
    }

    @PutMapping("/{id}/")
    public Inscripcion update(@RequestBody Inscripcion entity) {
        return inscripcionService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id) {
        inscripcionService.deleteById(id);
    }

}
