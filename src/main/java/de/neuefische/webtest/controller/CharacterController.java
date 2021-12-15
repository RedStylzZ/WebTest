package de.neuefische.webtest.controller;

import com.fasterxml.jackson.databind.JsonNode;
import de.neuefische.webtest.model.Student;
import de.neuefische.webtest.model.WebClientService;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/rickandmorty/character/")
public class CharacterController {

    private final WebClientService webClientService;

    public CharacterController(WebClientService webClientService) {
        this.webClientService = webClientService;
    }

    @GetMapping()
    public JsonNode getPage(@RequestParam("page") Optional<String> page, @RequestParam("name") Optional<String> name,
                            @RequestParam("status") Optional<String> status, @RequestParam("species") Optional<String> species,
                            @RequestParam("type") Optional<String> type, @RequestParam("gender") Optional<String> gender) {
        System.out.println(page.getClass().getName());

        Map<String, Optional<String>> parameters = Map.of(
                page.getClass().getName(), page,
                name.getClass().getName(), name,
                status.getClass().getName(), status,
                species.getClass().getName(), species,
                type.getClass().getName(), type,
                gender.getClass().getName(), gender
                );

        return webClientService.getCharacters(parameters);
    }

    @GetMapping(path = "{id}")
    public JsonNode getCharacterById(@PathVariable String id) {
        return webClientService.getCharacterById(id);
    }

}
