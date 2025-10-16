/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notebloc.helpers;
import java.util.Scanner;

/**
 * Clase auxiliar para imprimir texto formateado.
 * Simplifica el uso de System.out.printf en todo el proyecto.
 */

public  class ConsoleHelper {
    
    private static final Scanner SC = new Scanner(System.in, "UTF-8");
    
    public static void printf(String format, Object... args) {
        System.out.printf(format, args);        
    }
    
    public static void line() {
        System.out.println("----------------------------------------");
    }
     
    public static void title(String text) {
        line();
        System.out.printf("%s%n", text);
        line();
    }
    
    public static void pause(String message) {
        System.out.printf("%n%s", message);
        SC.nextLine();
    }
    
    public static String readLine(String prompt) {
        System.out.printf("%s", prompt);
        return SC.nextLine();
    }
    
    
}
