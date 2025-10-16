
package notebloc;
import static notebloc.helpers.ConsoleHelper.*;
import java.util.ArrayList;

/**
 * Programa principal del proyecto NoteBloc.
 * Este archivo solo muestra un mensaje inicial.
 */
   
public class Main {

        public static void main(String[] args) {
            title("NoteBloc - Menú principal");
             
            ArrayList<Note> notes = new ArrayList<>();
            
            int nextId = 1;
            CsvStore store = new CsvStore(); // Maneja CSV.
            
            boolean continuar = true;
            
            while (continuar) {
                printf("%n1 - Crear una nota.");
                printf("%n2 - Listar notas.");
                printf("%n3 - Guardar.");
                printf("%n0 - Salir.");
            
            
            String option = readLine("Seleccione una opción: ");
            
            
            switch (option) {
                case "1" -> {
                String title = readLine("Título: ");
                String content = readLine("Contenido: ");
                Note nueva = new Note(nextId++, title, content);
                notes.add(nueva);
                printf("%nNota añadida correctamente.");
                pause("Pulse Enter para continuar.");
                
            }
                
                case "2" -> {
                    if (notes.isEmpty()) {
                        printf("No hay notas que mostrar");
                    } else {
                        title("NOTAS:");
                        for(Note n : notes) {
                            n.show();
                        }
                    }
                }
                
                case "3" -> {
                    store.saveAll(notes);
                    pause("Info guardada. 'Enter' para continuar...");
                }
                
                case "0" -> {
                    continuar = false;
                }
                
                default -> {
                    printf("Opción no válida.%n");
                }
            }
        }
            printf("Hasta pronto amigo.");
    }
}

