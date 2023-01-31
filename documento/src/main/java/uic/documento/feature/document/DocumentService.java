package uic.documento.feature.document;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class DocumentService {
    @Autowired
    DocumentRepository documentRepository;

    @Transactional
    public Document save(Document entity) {
        return documentRepository.save(entity);
    }

    public Document findById(Long id) {
        return documentRepository.findById(id).orElse(new Document());
    }

    public void deleteById(Long id) {
        documentRepository.deleteById(id);
    }

    public List<Document> findAll() {
        return documentRepository.findAll();
    }
}

