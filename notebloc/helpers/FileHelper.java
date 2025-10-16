/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notebloc.helpers;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
/**
 * FileHelper
 * ------------------------------
 * Utilidades comunes para manejo de archivos y carpetas.
 * - Asegura que una carpeta o archivo existe.
 * - Centraliza posibles errores de E/S.
 */
public class FileHelper {
    // Crea CARPETA si no existe.
    public static void enDirExs(Path dir) {
        try {
            if (dir != null && !Files.exists(dir)) {
                Files.createDirectory(dir);
            }
        } catch (IOException ex) {
            throw new UncheckedIOException("Error creando la carpeta: " + dir, ex);
        }
    }
    
    // Crea ARCHIVO si no existe.
    public static void enFilExs(Path file) {
        try {
            enDirExs(file.getParent());
            if(!Files.exists(file)) {
                Files.createFile(file);
            } 
         } catch (IOException ex) {
                throw new UncheckedIOException("Error creando el archivo: " + file, ex);
        }
    }
}
