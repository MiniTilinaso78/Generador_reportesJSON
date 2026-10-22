public class GeneradorReporteJSON {
    public static void main(String[] args) {
        String matricula = "2026-A948";
        String nombreAlumno = "Ana María Gómez";
        double promedioGeneral = 9.45;
        boolean activo = true;
        String plantillaJson = """  
        {
          "estudiante": {
            "matricula": "%s",
            "nombre": "%s",
            "promedio": %.2f,
            "estatus": %b
          }
        }
        """;
        String jsonFinal = plantillaJson.formatted(matricula,nombreAlumno,promedioGeneral,activo);
        System.out.println(jsonFinal);


    }
}
