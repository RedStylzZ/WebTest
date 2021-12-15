package de.neuefische.webtest.controller;

import com.fasterxml.jackson.databind.JsonNode;
import de.neuefische.webtest.model.WebClientService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/rickandmorty/location/")
public class LocationController {

    private final WebClientService webClientService;

    public LocationController(WebClientService webClientService) {
        this.webClientService = webClientService;
    }

    @GetMapping
    public JsonNode getPage(@RequestParam("page") Optional<String> page) {
        return page.isEmpty() ? webClientService.getLocations() : webClientService.getLocationPage(page);
    }

    @GetMapping(path = "{id}")
    public JsonNode getLocationById(@PathVariable String id) {
        return webClientService.getLocationById(id);
    }

}
