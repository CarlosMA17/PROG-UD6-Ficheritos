package Actividad3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
            throws IOException {
        String ficheroActividad1 = "src/Actividad1/actividad1.txt";
        String ficheroActividad2 = "src/Actividad2/actividad2";
        String nombreArchivo = "src/Actividad3/actividad3";
        StringBuilder contenidoActividad1 = new StringBuilder();
        StringBuilder contenidoActividad2 = new StringBuilder();

        int linea;
        FileReader fileReader = new FileReader(ficheroActividad1);
        while ((linea = fileReader.read()) != -1) {
            contenidoActividad1.append((char) linea);
        }

        fileReader = new FileReader(ficheroActividad2);
        while ((linea = fileReader.read()) != -1) {
            contenidoActividad2.append((char) linea);
        }
        String contenidoFinal;
        contenidoFinal = "- Contenido del Fichero Uno: <" + contenidoActividad1 + ">\n\n- Contenido del Fichero Dos: <" + contenidoActividad2 + ">" +
                "\n firmado por carlos martel ";

        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo);
            fileWriter.write(contenidoFinal);
            fileWriter.close();
            System.out.println("se ha creado el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
