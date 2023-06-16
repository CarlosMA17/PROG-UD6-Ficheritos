package Actividad1;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombreFichero = "actividad1.txt";
        String rutaPrincipal = "src/Actividad1/";
        String rutaArchivo = rutaPrincipal + nombreFichero;

        // Solicitar texto al usuario
        Scanner scanner = new Scanner(System.in);
        String texto = "";
        while (texto.length() < 30) {
            System.out.println("Introduce un texto con al menos 30 caracteres:");
            texto = scanner.nextLine();
            if (texto.length() < 30) {
                System.out.println("El texto introducido es demasiado corto. Faltan "
                        + (30 - texto.length()) + " caracteres.");
            }
        }
        texto = texto.toUpperCase(Locale.ROOT).replace(" ", "_");


        // Guardar el texto formateado en el archivo
        try {
            FileWriter fileWriter = new FileWriter(rutaArchivo);
            fileWriter.write(texto);
            fileWriter.close();
            System.out.println("El texto formateado se ha guardado en el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}