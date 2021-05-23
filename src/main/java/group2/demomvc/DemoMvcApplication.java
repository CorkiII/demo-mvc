package group2.demomvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMvcApplication.class, args);
    }

    @GetMapping(value = "/produit", produces = MediaType.TEXT_PLAIN_VALUE)
    public String produit() {
        return "produit";
    }
}
