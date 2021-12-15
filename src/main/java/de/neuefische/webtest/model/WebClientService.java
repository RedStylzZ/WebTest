package de.neuefische.webtest.model;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;
import java.util.Optional;

@Service
public class WebClientService {
    private final WebClient webClient;

    public WebClientService() {
        this.webClient = WebClient.create("https://rickandmortyapi.com/api");
    }

    public String concatString(Map<String, Optional<String>> parameter) {
        StringBuilder apiParameter = new StringBuilder();
        apiParameter.append("?");
        for (Map.Entry<String, Optional<String>> entry : parameter.entrySet()) {
            if (entry.getValue().isEmpty()) continue;
            apiParameter.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        return apiParameter.toString();
    }

    // Character Space -------------------------------------------------------------------------------------------------
    /*public JsonNode getCharacters() {
        return webClient.get().uri("/character/").retrieve().bodyToMono(JsonNode.class).block();
    }*/

    public JsonNode getCharacters(Map<String, Optional<String>> parameters) {

        String apiParameter = concatString(parameters);
        return webClient.get().uri("/character/" + apiParameter).retrieve().bodyToMono(JsonNode.class).block();
    }

    public JsonNode getCharacterById(String id) {
        return webClient.get().uri("/character/" + id).retrieve().bodyToMono(JsonNode.class).block();
    }

    public JsonNode getCharacterPage(Optional<String> page) {
        return webClient.get().uri("/character/?page=" + page.get()).retrieve().bodyToMono(JsonNode.class).block();
    }
    // -----------------------------------------------------------------------------------------------------------------

    // Episode Space ---------------------------------------------------------------------------------------------------
    public JsonNode getEpisodes() {
        return webClient.get().uri("/episode/").retrieve().bodyToMono(JsonNode.class).block();
    }

    public JsonNode getEpisodeById(String id) {
        return webClient.get().uri("/episode/" + id).retrieve().bodyToMono(JsonNode.class).block();
    }

    public JsonNode getEpisodePage(Optional<String> page) {
        return webClient.get().uri("/episode?page=" + page.get()).retrieve().bodyToMono(JsonNode.class).block();
    }
    // -----------------------------------------------------------------------------------------------------------------

    // Location Space --------------------------------------------------------------------------------------------------
    public JsonNode getLocations() {
        return webClient.get().uri("/location/").retrieve().bodyToMono(JsonNode.class).block();
    }

    public JsonNode getLocationById(String id) {
        return webClient.get().uri("/location/" + id).retrieve().bodyToMono(JsonNode.class).block();
    }

    public JsonNode getLocationPage(Optional<String> page) {
        return webClient.get().uri("/location?page=" + page.get()).retrieve().bodyToMono(JsonNode.class).block();
    }

    // -----------------------------------------------------------------------------------------------------------------


}
