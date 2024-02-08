package modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Familia(String father, String mother, String son, String daughter, String wife) {

}