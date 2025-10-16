/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notebloc;
import static notebloc.helpers.ConsoleHelper.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa una nota.
 * Versión 2: incluye contenido y fecha de creación.
 */

public class Note {    
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    // Campos - Atributos.
    private int id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    
    // Constructor.
    public Note(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdAt = LocalDateTime.now();
    }
    
    // Método para mostrar por consola.
    public void show() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        printf("[%d] - %s%n", id, title);
        printf("Creada: %s%n", FMT.format(createdAt));
        printf("Contenido: %s%n", content);
        line();
    }
    
    // Geters para acceder a campos privados.
    public int getId(){
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public java.time.LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
}
