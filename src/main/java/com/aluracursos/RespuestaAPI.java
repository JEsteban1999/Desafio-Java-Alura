package com.aluracursos;

import java.util.Map;

public record RespuestaAPI(String result, String base_code, Map<String, Double> conversion_rates) {
    
}
