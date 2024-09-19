package com.aluracursos;

public record Tasa(Double USD, Double COP, Double EUR) {
    @Override
    public String toString() {
        return "Tasas de cambio: USD=" + USD + ", COP=" + COP + ", EUR=" + EUR;
    }
}
