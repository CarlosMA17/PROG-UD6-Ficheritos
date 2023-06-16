package Actividad2;

import java.io.*;

public class Main {
    public static void main(String[] args)
        throws IOException {
            String nombreFichero = "src/Actividad2/actividad2";
            StringBuilder contenido = new StringBuilder();

            FileReader fileReader = new FileReader(nombreFichero);
            int linea;
            while ((linea = fileReader.read()) != -1) {
                contenido.append((char) linea).append("_").append(linea).append(",");
            }
            System.out.println(contenido);
        }
    }


