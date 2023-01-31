// package uic.inscripcion.inscripcionese;

// import java.lang.reflect.Field;
// import java.util.List;
// import java.util.Map;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PatchMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;

// @RestController
// @RequestMapping("inscripciones")
// @CrossOrigin({ "*" })


// public class InscripcionesController {
    
//     @Autowired
//     CustomerInscripciones inscripciones;

//     @GetMapping("/")
//     public List<InscripcionesDTO> findAll() {
//         return inscripciones.findAll();
//     }

//     @GetMapping("/{id}/")
//     public InscripcionesDTO findById(@PathVariable Long id) {
//         return inscripciones.findById(id);
//     }

//     @PostMapping("/")
//     public InscripcionesDTO save(@RequestBody InscripcionesDTO entity) {
//         return inscripciones.save(entity);
//     }

//     @DeleteMapping("/{id}/")
//     public void deleteById(@PathVariable Long id) {
//         inscripciones.deleteById(id);
//     }

//     @PutMapping("/{id}/")
//     public InscripcionesDTO update(@PathVariable Long id, @RequestBody InscripcionesDTO entity) {
//         return inscripciones.update(id, entity);
//     }

//     @PatchMapping("/{id}/")
//     public InscripcionesDTO partialUpdate(@PathVariable Long id, @RequestBody Map<String, Object> fields){

//         InscripcionesDTO InscripcioneseDTO = inscripciones.findById(id);

//         // itera sobre los campos que se desean actualizar
//         for (Map.Entry<String, Object> field : fields.entrySet()) {
//             String fieldName = field.getKey();
//             Object fieldValue = field.getValue();
            
//             // utiliza reflection para establecer el valor del campo en la entidad
//             try {
//                 Field campoEntidad = InscripcionesDTO.class.getDeclaredField(fieldName);
//                 campoEntidad.setAccessible(true);
//                 campoEntidad.set(InscripcioneseDTO, fieldValue);
//             } catch (NoSuchFieldException | IllegalAccessException ex) {
//                 // maneja la excepción si ocurre algún error al acceder al campo
//             }
//         }
//         return inscripciones.update(id, InscripcioneseDTO);
//     }
// }
