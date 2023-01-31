package uic.inscripcion.feature.inscripcion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Inscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    // private Integer  requestId;
    // private Integer docUploadId;
    // private Integer stateId ;
    // private Integer requirementId;
    private String observation;
}
