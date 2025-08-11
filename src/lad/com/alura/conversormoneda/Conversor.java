package lad.com.alura.conversormoneda;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Conversor {

    private static final String API_KEY = "2984b98a168110583fef6382";
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();

    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("""
                ********************************************
                Sea bienvenido/a al Conversor de Moneda =]

                1) Dólar => Peso argentino
                2) Peso argentino => Dólar
                3) Dólar => Real brasileño
                4) Real brasileño => Dólar
                5) Dólar => Peso colombiano
                6) Peso colombiano => Dólar
                7) Salir
                Elija una opción válida:
                ********************************************
                """);

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Introduce la cantidad a convertir: ");
                double cantidad = scanner.nextDouble();

                String from = "";
                String to = "";

                switch (opcion) {
                    case 1 -> { from = "USD"; to = "ARS"; }
                    case 2 -> { from = "ARS"; to = "USD"; }
                    case 3 -> { from = "USD"; to = "BRL"; }
                    case 4 -> { from = "BRL"; to = "USD"; }
                    case 5 -> { from = "USD"; to = "COP"; }
                    case 6 -> { from = "COP"; to = "USD"; }
                }

                try {
                    double tasa = obtenerTasaPorMonedas(from, to);
                    double resultado = cantidad * tasa;
                    System.out.printf("Resultado: %.2f %s%n", resultado, to);
                } catch (Exception e) {
                    System.out.println("❌ Error al obtener la tasa: " + e.getMessage());
                }
            } else if (opcion != 7) {
                System.out.println("⚠️ Opción no válida. Intente de nuevo.");
            }
        }

        System.out.println("Gracias por usar el conversor!");
    }

    public static double obtenerTasaPorMonedas(String from, String to) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + from;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String jsonString = response.body();

        JsonObject json;
        try {
            json = gson.fromJson(jsonString, JsonObject.class);
        } catch (Exception e) {
            throw new IOException("La API no devolvió un JSON válido.");
        }

        if (!json.has("conversion_rates")) {
            throw new IOException("Respuesta inesperada de la API.");
        }

        JsonObject rates = json.getAsJsonObject("conversion_rates");
        if (!rates.has(to)) {
            throw new IOException("No se encontró la tasa para " + to);
        }

        return rates.get(to).getAsDouble();
    }
}
