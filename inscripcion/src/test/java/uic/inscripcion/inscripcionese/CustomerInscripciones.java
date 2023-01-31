// package uic.inscripcion.inscripcionese;

// import java.util.List;

// import org.springframework.cloud.openfeign.FeignClient;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;

// @CrossOrigin({ "*" })
// @FeignClient(name = "bff.customer.inscripciones", url = "http://localhost:8083/api/inscripciones")
// public interface CustomerInscripciones {

//     @GetMapping("/{id}/")
//     InscripcionesDTO findById(@PathVariable("id") Long id);

//     @GetMapping("/")
//     List<InscripcionesDTO> findAll();

//     @PostMapping("/")
//     InscripcionesDTO save(InscripcionesDTO entity);

//     @DeleteMapping("/{id}/")
//     void deleteById(@PathVariable("id") Long id);

//     @PutMapping("/{id}/")
//     InscripcionesDTO update(@PathVariable("id") Long id, InscripcionesDTO entity);

//     @PutMapping("/{id}/completardatos/")
//     InscripcionesDTO completardatos(@PathVariable("id") Long id);

// }
