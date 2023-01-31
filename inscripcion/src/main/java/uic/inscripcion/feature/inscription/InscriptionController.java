package uic.inscripcion.feature.inscription;

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
@RequestMapping("api/inscription")
@CrossOrigin({"*"})

public class InscriptionController {
    @Autowired InscriptionService inscriptionService;


    //GET
    @GetMapping("/")
    public List<Inscription> findAll(){
        return inscriptionService.findAll();
    }

    @GetMapping("/{id}/")
    public Inscription findById(@PathVariable Long id){
        return inscriptionService.findById(id);
    }

    //GUARDAR
    @PostMapping("/")
    public Inscription save(@RequestBody Inscription entity){
        return inscriptionService.save(entity);
    }

    //ACTUALIZAR
    @PutMapping("/{id}/")
    public Inscription update(@RequestBody Inscription entity) {
        return inscriptionService.save(entity);
    }

    //ELIMINAR
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        inscriptionService.deleteById(id);
    }
}

