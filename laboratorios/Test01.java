/*
    Autor: Elias Arevalo
    Date: 03-2024
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

class Test01 {
    public static void main(String[] args) {
        String url = "https://example.org/";
        HashMap respuesta = new HashMap();
        try {
            respuesta = httpUrlConnection(url, "GET");
            // imprimir metodo y respuesta
            System.out.println("Metodo: " + respuesta.get("method"));
            System.out.println("Respuesta: " + respuesta.get("response"));
        } catch (Exception e) {
            // Manejar excepción
            e.printStackTrace();
        }
    }

    // el metodo peticionHttpGet recibe una url y retorna un HashMap con el metodo y la respuesta
    public static HashMap httpUrlConnection(String urlParaVisitar, String metodo) throws Exception {
        StringBuilder resultado = new StringBuilder();
        URL url = new URL(urlParaVisitar);

        // crea un HashMap para guardar el metodo y la respuesta
        HashMap<String, String> parametros = new HashMap<>();

        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod(metodo);
        BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
        String linea;
        while ((linea = rd.readLine()) != null) {
            resultado.append(linea);
        }

        rd.close();

        // guardar el metodo y la respuesta en el HashMap
        parametros.put("method", metodo);
        parametros.put("response", resultado.toString());
        
        return parametros;
    }
}