/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notebloc;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.io.IOException;
import java.io.BufferedWriter;
import java.time.format.DateTimeFormatter;

import static notebloc.Config.*;
import static notebloc.helpers.ConsoleHelper.printf;

/**
 * Paso 7B: Preparar el archivo CSV (crear carpeta y escribir cabecera).
 * Aún no volcamos las notas; eso será en el siguiente micro-paso.
 */

public class CsvStore {
    private final Path path = Paths.get(DATA_FILE);
    
    // Crea /data si hace falta y escribe la cabecera del CSV.
    public void saveAll(List<Note> notes) {
        try {
            // Asegurar la carpeta data/.
            if (path.getParent() != null) {
                Files.createDirectories(path.getParent());
            }
            
            // Escribir sólo la cabecera (sin notas).
            try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
                // Escritura de cabecera.
                bw.write("id" + SEP + "title" + SEP + "content" + SEP + "createdAt" + "hola");
                bw.newLine();
                
                // Escritura de cada nota de la lista.
                DateTimeFormatter fmt = DateTimeFormatter.ofPattern(DATE_PATTERN);
                for (Note n : notes) {
                    bw.write(
                            n.getId() + SEP +
                            n.getTitle() + SEP + 
                            n.getContent() + SEP +
                            fmt.format(n.getCreatedAt())
                    );
                    bw.newLine();                    
                }               
            }           
            printf("%n[OK] Cabecera CSV escrita en: %s%n", path.toAbsolutePath());
        } catch (IOException ex) {
            printf("%n[ERROR] No se pudo preparar el CSV: %s%n", ex.getMessage()); 
        }
    }
}
