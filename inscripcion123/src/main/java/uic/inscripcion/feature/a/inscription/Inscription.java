package uic.inscripcion.feature.a.inscription;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    // private Integer dniId;
    // private Integer studentId;
    // private Integer stateId;
    // private Integer modalityId;
}
