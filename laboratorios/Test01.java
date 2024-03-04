/*
    Autor: Elias Arevalo
    Date: 03-2024
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class Test01 {
    public static void main(String[] args) {
        String url = "https://www.datos.gov.py/dataset/proyectos-adjudicados-hackathon";
        String respuesta = "";
        try {
            // Llamamos a la función y guardamos la respuesta
            respuesta = peticionHttpGet(url);
            // Imprimimos la respuesta
            System.out.println("La respuesta es:\n" + respuesta);
        } catch (Exception e) {
            // Manejar excepción
            e.printStackTrace();
        }
    }

    // Método para hacer la petición GET
    public static String peticionHttpGet(String urlParaVisitar) throws Exception {
        StringBuilder resultado = new StringBuilder();
        // Creamos un objeto de tipo URL
        URL url = new URL(urlParaVisitar);

        // Abrimos la conexión e indicamos que será de tipo GET
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        // Creamos un BufferedReader para leer la respuesta
        conexion.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
        String linea;
        // Leemos la respuesta línea por línea
        while ((linea = rd.readLine()) != null) {
            resultado.append(linea);
        }

        // Cerramos la conexión
        rd.close();
        // Retornamos la respuesta
        return resultado.toString();
    }
}