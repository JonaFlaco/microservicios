package uic.inscripcion.feature.inscription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscriptionService {
    @Autowired InscriptionRepository inscriptionRepository;

    public Inscription save(Inscription entity){
        return inscriptionRepository.save(entity);
    }

    public Inscription findById( Long id){
        return inscriptionRepository.findById(id).orElse(new Inscription());
    }

    public void deleteById(Long id){
        inscriptionRepository.deleteById(id);
    }

    public List<Inscription> findAll(){
        return inscriptionRepository.findAll();
    }

}
