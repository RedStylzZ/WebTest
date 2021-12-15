package de.neuefische.webtest.controller;

import com.fasterxml.jackson.databind.JsonNode;
import de.neuefische.webtest.model.WebClientService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/rickandmorty/episode/")
public class EpisodeController {

    private final WebClientService webClientService;

    public EpisodeController(WebClientService webClientService) {
        this.webClientService = webClientService;
    }

    @GetMapping
    public JsonNode getPage(@RequestParam("page") Optional<String> page) {
        return page.isEmpty() ? webClientService.getEpisodes() : webClientService.getEpisodePage(page);
    }

    @GetMapping(path = "{id}")
    public JsonNode getEpisodeById(@PathVariable String id) {
        return webClientService.getEpisodeById(id);
    }
}
