package uic.documento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DocumentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentoApplication.class, args);
	}

}
