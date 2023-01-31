// package uic.documento.upload;

// import java.util.List;

// import org.springframework.cloud.openfeign.FeignClient;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;

// @CrossOrigin({ "*" })
// @FeignClient(name = "bff.customer.upload", url = "http://localhost:8084/api/upload")
// public interface CustomerUpload {

//     @GetMapping("/{id}/")
//     UploadDTO findById(@PathVariable("id") Long id);

//     @GetMapping("/")
//     List<UploadDTO> findAll();

//     @PostMapping("/")
//     UploadDTO save(UploadDTO entity);

//     @DeleteMapping("/{id}/")
//     void deleteById(@PathVariable("id") Long id);

//     @PutMapping("/{id}/")
//     UploadDTO update(@PathVariable("id") Long id, UploadDTO entity);

//     @PutMapping("/{id}/completardatos/")
//     UploadDTO completardatos(@PathVariable("id") Long id);

// }
