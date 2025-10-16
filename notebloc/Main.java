/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notebloc;
import static notebloc.helpers.ConsoleHelper.*;
import java.util.ArrayList;

/**
 * Programa principal del proyecto NoteBloc.
 * Este archivo solo muestra un mensaje inicial.
 * Paso 1: probar que el proyecto ejecuta correctamente.
 */
   
public class Main {
 /*  
    public static void main(String[] args) {
        title("Bienvenido a NoteBloc");
        printf("Aplicación inciada correctamente.%n");              
              
         // NOTA SIMPLE.
         //title("Prueba de la clase Note... ");
         //Note n1 = new Note(1, "Basic JAVA", "Repasar bloques 1 a 6 y practicar con NoteBloc");
         //n1.show();
         
         // 1) ARRAY-LIST PARA LAS NOTAS.
         ArrayList<Note> notes = new ArrayList<>();
         
         // 2) AÑADIR NOTAS (manualmente en este paso por ahora).
         notes.add(new Note(1, "Planificar estudio", "Repasar temas JAVA y organizar horarios."));
         notes.add(new Note(2, "Comprar", "Especialmente cerveza y panchitos para las sesiones de JAVA"));
         notes.add(new Note(3, "Mantenimiento", "Probar la aplicación de noteBloc, guardado etc..."));
         
         // 3) MOSTRAR TODAS LAS NOTAS.
         for (Note n : notes) {
             n.show();
         }
         */
           /////////////////////////////////////////////////////////////////////
          /*
           title("NoteBloc - Añadir notas por consola.");
          
          ArrayList<Note>notes = new ArrayList<>();
          int nextId = 1;
          
          boolean continuar = true;
          
          while(continuar) {
              printf("%n1 - Crear nueva nota.%n");
              printf("2 - Listar notas%n");
              printf("0 - Salir.");
              
              String option = readLine("Seleccione una opción: ");
              
              switch (option) {
                  case  "1" -> {
                      String title = readLine("Título: ");
                      String content = readLine("Contenido: ");
                      Note nueva = new Note(nextId++, title, content);
                      notes.add(nueva);
                      printf("%nNota añadida corréctamente.%n");
                      pause("Pulse Enter para continuar...");
                  }
                  case "2" -> {
                      if(notes.isEmpty()) {
                          printf("%nNo hay notas guardadas...%n");
                      } else {
                          title("NOTAS:");
                          for (Note n : notes) n.show();
                      }
                      pause("Pulse Enter para volver al menú...");
                  }
                  case "0" -> {
                      continuar = false;
                  }
                  default -> {
                      printf("Opción no válida...%n");
                  }
              }
          }
          title("Hasta la próxima");
           */
          /////////////////////////////////////////////////////////////////////
         
         /* title("NoteBloc - Preparar CSV");
          
          ArrayList<Note> notes = new ArrayList<>();
          CsvNoteStore store = new CsvNoteStore();
          store.saveAll(notes); // Crea data y escribe la cabecera.
                             
         pause("Comprueba el archivo datta/notes. Pulse Enter para salir...");

         title("NoteBloc -Guardar pruega básica.");
         
         ArrayList<Note> notes = new ArrayList<>();
         notes.add(new Note(1, "Prueba de CSV", "Esto es una nota de prueba hámijo."));
         
         CsvNoteStore store = new CsvNoteStore();
         store.saveAll(notes);
         
         pause("Pulse Enter para salir...");
*/
        
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
