package de.neuefische.webtest;

import com.fasterxml.jackson.databind.JsonNode;
import de.neuefische.webtest.controller.StudentController;
import de.neuefische.webtest.model.Student;
import de.neuefische.webtest.model.WebClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class Main {


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
