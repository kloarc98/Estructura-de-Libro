/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuralibros;
import java.util.Scanner;

/**
 *
 * @author Kevin Loarca 0901-17-11537
 */
public class Menu {
    
    public static void main (String[] args){
            Scanner Scanner = new Scanner(System.in);
            Lista list = new Lista();
            int opcion;
            String autor,titulo,isbn;
            //Un do while para a la hora de hace una accion del main te regrese al main
            do{
                //El menu de todas las opciones
            System.out.println("Ingrese que opcion desea");
            System.out.print("1. Inserta al Principio\n2. Insertar Final\n3. Insertar Despues\n"
                    + "4. Obtener Numero\n5. Contar\n6. Eliminar Principio\n7. Eliminar Ultimo\n8. Eliminar Libro\n9. Salir\n");
           opcion = Scanner.nextInt();
                
            switch(opcion){
                //Todos los case de las opciones del menu
                case 1:
                    System.out.println("Ingrese Autor");
                    autor = Scanner.next();
                    System.out.println("Ingrese Titulo");
                    titulo = Scanner.next();
                    System.out.println("Ingrese isbn");
                    isbn = Scanner.next();
                    list.insertarPrincipio(new Libro(titulo,autor,isbn));
                    list.Listar();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9: 
                    break;
            }
                   
            }while(opcion!=0);
        }
    
}
