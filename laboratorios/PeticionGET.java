/*
    Autor: Elias Arevalo
    Date: 03-2024
 */
import java.io.*;
import java.net.*;

public class PeticionGET {

    public static void main(String[] args) {
        try {
            // URL
            String var_url = "https://www.google.com/";
            // Crear URL
            URL url = new URL(var_url);

            // ABRIR CONEXION
            URLConnection conexion = url.openConnection();

            // LEER DE LA URL
            InputStreamReader input_str = new InputStreamReader(conexion.getInputStream());
            BufferedReader reader = new BufferedReader(input_str);
            
            // LEER LINEA POR LINEA
            String linea;

            // MIENTRAS HAYA LINEAS
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

            // CERRAR FLUJO
            reader.close();// cerrar flujo

        } catch (MalformedURLException me) {

            // Manejar excepción
            System.err.println("MalformedURLException: " + me);

        } catch (IOException ioe) {
            
            // Manejar excepción
            System.err.println("IOException:  " + ioe);
        }
    }// main
}