// package uic.documento.upload;

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
// @RequestMapping("uploade")
// @CrossOrigin({ "*" })


// public class UploadController {
    
//     @Autowired
//     CustomerUpload upload;

//     @GetMapping("/")
//     public List<UploadDTO> findAll() {
//         return upload.findAll();
//     }

//     @GetMapping("/{id}/")
//     public UploadDTO findById(@PathVariable Long id) {
//         return upload.findById(id);
//     }

//     @PostMapping("/")
//     public UploadDTO save(@RequestBody UploadDTO entity) {
//         return upload.save(entity);
//     }

//     @DeleteMapping("/{id}/")
//     public void deleteById(@PathVariable Long id) {
//         upload.deleteById(id);
//     }

//     @PutMapping("/{id}/")
//     public UploadDTO update(@PathVariable Long id, @RequestBody UploadDTO entity) {
//         return upload.update(id, entity);
//     }

//     @PatchMapping("/{id}/")
//     public UploadDTO partialUpdate(@PathVariable Long id, @RequestBody Map<String, Object> fields){

//         UploadDTO UploadeDTO = upload.findById(id);

//         // itera sobre los campos que se desean actualizar
//         for (Map.Entry<String, Object> field : fields.entrySet()) {
//             String fieldName = field.getKey();
//             Object fieldValue = field.getValue();
            
//             // utiliza reflection para establecer el valor del campo en la entidad
//             try {
//                 Field campoEntidad = UploadDTO.class.getDeclaredField(fieldName);
//                 campoEntidad.setAccessible(true);
//                 campoEntidad.set(UploadeDTO, fieldValue);
//             } catch (NoSuchFieldException | IllegalAccessException ex) {
//                 // maneja la excepción si ocurre algún error al acceder al campo
//             }
//         }
//         return upload.update(id, UploadeDTO);
//     }
// }
