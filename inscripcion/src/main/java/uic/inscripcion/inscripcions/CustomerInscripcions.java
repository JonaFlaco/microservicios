package uic.inscripcion.inscripcions;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@CrossOrigin({ "*" })
@FeignClient(name = "bff.customer", url = "http://localhost:3000/api/inscripcions")
public interface CustomerInscripcions {

    @GetMapping("/{id}/")
    InscripcionsDTO findById(@PathVariable("id") Long id);

    @GetMapping("/")
    List<InscripcionsDTO> findAll();

    @PostMapping("/")
    InscripcionsDTO save(InscripcionsDTO entity);

    @DeleteMapping("/{id}/")
    void deleteById(@PathVariable("id") Long id);

    @PutMapping("/{id}/")
    InscripcionsDTO update(@PathVariable("id") Long id, InscripcionsDTO entity);

    @PutMapping("/{id}/completardatos/")
    InscripcionsDTO completardatos(@PathVariable("id") Long id);

}
