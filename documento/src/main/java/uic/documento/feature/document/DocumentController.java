package uic.documento.feature.document;
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
@RequestMapping("api/document")
@CrossOrigin({ "*" }) 

public class DocumentController {
    @Autowired
    DocumentService documentService;

    @GetMapping("/{id}/")
    public Document findById(@PathVariable Long id) {
        return documentService.findById(id);
    }


    @GetMapping("/")
    public List<Document> findAll() {
        return documentService.findAll();
    }

    @PostMapping("/")
    public Document save(@RequestBody Document entity) {
        return documentService.save(entity);
    }

    @PutMapping("/{id}/")
    public Document update(@RequestBody Document entity) {
        return documentService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id) {
        documentService.deleteById(id);
    }
}
