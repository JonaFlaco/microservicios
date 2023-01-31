package uic.inscripcion.inscripcions;


import lombok.Data;

@Data
public class InscripcionsDTO {

    private long id;
    private Integer requestId;
    private Integer docUploadId;
    private Integer stateId ;
    private Integer requirementId;
    private String observation;

}
