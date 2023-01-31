package uic.inscripcion.inscripcions;


import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("inscripcionse")
@CrossOrigin({ "*" })


public class InscripcionsController {
    
    @Autowired
    CustomerInscripcions inscripcions;

    @GetMapping("/")
    public List<InscripcionsDTO> findAll() {
        return inscripcions.findAll();
    }

    @GetMapping("/{id}/")
    public InscripcionsDTO findById(@PathVariable Long id) {
        return inscripcions.findById(id);
    }

    @PostMapping("/")
    public InscripcionsDTO save(@RequestBody InscripcionsDTO entity) {
        return inscripcions.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id) {
        inscripcions.deleteById(id);
    }

    @PutMapping("/{id}/")
    public InscripcionsDTO update(@PathVariable Long id, @RequestBody InscripcionsDTO entity) {
        return inscripcions.update(id, entity);
    }

    @PatchMapping("/{id}/")
    public InscripcionsDTO partialUpdate(@PathVariable Long id, @RequestBody Map<String, Object> fields){

        InscripcionsDTO InscripcionseDTO = inscripcions.findById(id);

        // itera sobre los campos que se desean actualizar
        for (Map.Entry<String, Object> field : fields.entrySet()) {
            String fieldName = field.getKey();
            Object fieldValue = field.getValue();
            
            // utiliza reflection para establecer el valor del campo en la entidad
            try {
                Field campoEntidad = InscripcionsDTO.class.getDeclaredField(fieldName);
                campoEntidad.setAccessible(true);
                campoEntidad.set(InscripcionseDTO, fieldValue);
            } catch (NoSuchFieldException | IllegalAccessException ex) {
                // maneja la excepción si ocurre algún error al acceder al campo
            }
        }
        return inscripcions.update(id, InscripcionseDTO);
    }
}
